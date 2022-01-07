#include<stdio.h>
#include<stdlib.h>
struct node1
{
    int data;
    struct node *link;
}*newnode,*head;
struct node {
  int item;
  struct node* left;
  struct node* right;
};
struct node* createNode(value) {
  struct node* newNode = malloc(sizeof(struct node));
  newNode->item = value;
  newNode->left = NULL;
  newNode->right = NULL;

  return newNode;
}

struct node* insert(struct node* root, int value){
	int ce=0,co=0;
	if (value%2!=0){
		root->left = createNode(value);
		return root->left;
	}
	else{
		root->right = createNode(value);
		return root->right;
	}
}

void create(int item)
{
    newnode=(struct node1*)malloc(sizeof(struct node));
    newnode-> data=item;
    newnode->link=NULL;
    struct node1 *temp;
    if(head==NULL)
    {
        head=newnode;
        temp=newnode;
    }
    else
    {
        temp->link=newnode;
        temp=temp->link;
    }
}
void display()
{
    struct node1 *temp=head;
    if(head==NULL)
    {
        printf("list empty \n");
    }
    else
    {
        while(temp!=NULL)
        {
            printf("%d \t",temp->data);
            temp=temp->link;
        }
    }
}

char root_val(int arr[],int n){
	int i,co=0,ce=0;
	for(i=0;i<n;i++){
		if(arr[i]%2!=0){
			co++;
		}
		else{
			ce++;
		}
	}
	if(co>ce){
		return "o";
	}
	else{
		return "e";
	}
}

int main()
{
    int i,j;
	j=1;
	printf("Enter no of elements in the linked list: \n");
	int n;
	scanf("%d",&n);
	int arr[n];
	for(i=0;i<n;i++){
		int num;
		scanf("%d",&num);
		if (num==-1)
		   break;
		else{
			create(num);
			while (num >= 100) {
			num /= 10;
			}
			arr[i]=num;
			j++;
		}
	}
	//display();
	//printing elements of the array
	printf("the output list is: \n");
	for(i=0;i<n;i++){
		printf("%d\n",arr[i]);
	}
	
	int val;
	char s;
	s=root_val(arr,n);
	if (s=="o"){
		for(i=0;i<n;i++){
			if (arr[i]%2!=0){
				val=arr[i];
				break;
			}
		}
		
	}
	else{
		for(i=0;i<n;i++){
			if (arr[i]%2==0){
				val=arr[i];
				break;
			}
		}
	}
	struct node* root = createNode(val);
	for(i=0;i<n;i++){
		insert(root,arr[i]);
	}
    return 0;
    
}
