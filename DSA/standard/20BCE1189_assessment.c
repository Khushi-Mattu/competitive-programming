#include<stdio.h>
#include<stdlib.h>
struct Node {
  int data;
  struct Node* next;
};
void insert(struct Node* head, int data){

  struct Node* newNode = (struct Node*) malloc(sizeof(struct Node));
  newNode->data = data;
  newNode->next = head;

  head = newNode; 
}
struct Node* root2 = NULL;
void display(struct Node* node){
  while(node!=NULL)
  {
    printf("%d->",node->data);
    node = node->next;
  }
  printf("\n");
}
void local_max(struct Node* node,struct Node* root2)
{
	if((node->next->data)>node->data && (node->next->next->data > node->data)){
		insert(root2,node->data);
		node=node->next;
	}
}
int main()
{
    struct Node* root1 = NULL;
    int i,j,k;
	j=1;
	printf("Enter -1 to stop \n");
	printf("enter elements of first list: \n");
	for(i=0;i<j;i++){
		int num;
		scanf("%d",&num);
		if (num==-1)
		   break;
		else{
			insert(root1,num);
			j++;
		}
	}
	display(root1);
	display(root2);
	local_max(root1,root2);
}
