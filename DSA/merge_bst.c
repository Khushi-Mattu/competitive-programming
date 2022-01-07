#include <stdio.h>
#include <stdlib.h>

struct node 
{
  int key;
  struct node *left, *right;
};

struct node *newNode(int item) 
{
  struct node *temp = (struct node *)malloc(sizeof(struct node));
  temp->key = item;
  temp->left = temp->right = NULL;
  return temp;
}
void insert(struct Node *head, int data)
{
    struct node *temp =
        (struct Node *)malloc(sizeof(struct Node));
    temp->data = data;
    temp->next = temp->prev = NULL;
    if (!(head))
        (head) = temp;
    else
    {
        temp->next = head;
        (head)->prev = temp;
        (head) = temp;
    }
}
void printList(struct Node *head)
{
    struct Node *temp = head;
    
    while (head)
    {
        printf("%d ",head->data);
        temp = head;
        head = head->next;
    }
}
void inorder(struct node *root, struct node *head) {
  if (root != NULL) {
    inorderTraversal(root->left);
    //printf("%d ", root->key);
    insert(head,root->key);
    inorderTraversal(root->right);
  }
}
int main()
{
	struct node *root=NULL;
    struct node *root2=NULL;
    struct node *head=NULL;
    struct node *head2=NULL;
	printf("Enter the elements of the first BST \n");
	printf("Enter -1 to stop \n");
	int i,j;
	j=1;
	for(i=0;i<j;i++){
		int num;
		scanf("%d",&num);
		if (num==-1){
		   break;
		}
		else{
			root=insert(root,num);
			j++;
		}
	}
    printf("Enter the elements of the second BST \n");
	printf("Enter -1 to stop \n");
	int i,j;
	j=1;
	for(i=0;i<j;i++){
		int num;
		scanf("%d",&num);
		if (num==-1){
		   break;
		}
		else{
			root=insert(root2,num);
			j++;
		}
	}

    inorder(root,head);
    inorder(root2,head2);
    printList(head);
    printList(head2);

}