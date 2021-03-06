#include <stdio.h>
#include <stdlib.h>

struct node 
{
  int data;
  int counter;
  struct node *left, *right;
}*root = NULL;

struct node *newnode(int item) 
{
  struct node *newnode = (struct node *)malloc(sizeof(struct node));
  newnode->data=item;
  newnode->counter=1;
  newnode->left=NULL; 
  newnode->right=NULL;
  return newnode;
}

void inorder(struct node *root) 
{
  if (root != NULL) 
  {
    inorder(root->left);
    printf("%d  ", root->data);
    inorder(root->right);
  }
}

struct node *insert(struct node *node, int key) 
{
  if (node == NULL) 
  return newnode(key);

  if (key < (node->data))
    node->left = insert(node->left, key);
  else if(key > (node->data))
    node->right = insert(node->right, key);
  else
  (node->counter)++;

  return node;
}


int main() 
{
  struct node *root = NULL;
  int n;
  printf("Enter the number of nodes in the binary search tree : ");
  scanf("%d",&n);
  printf("Enter the elements of the binary search tree: \n");
  int i,a;
  for(i=0;i<n;i++)
  {
    scanf("%d",&a);
    if(a==-1)
    {
    	break;
	}
	else
	{
		root = insert(root,a);
	}
    
  }
  printf("tree without duplicates: ");
  inorder(root);
  return 0;
}
