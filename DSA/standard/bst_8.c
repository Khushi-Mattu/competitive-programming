#include<stdio.h>
#include<stdlib.h>
#include<string.h>
struct node {
  int key;
  struct node *left, *right;
};

//create a node
struct node *newNode(int item) {
  struct node *temp = (struct node *)malloc(sizeof(struct node));
  temp->key = item;
  temp->left = temp->right = NULL;
  return temp;
}

void preorderTraversal(struct node *root) 
{
  if (root != NULL) 
  {
    printf("%d  ", root->key);
    preorderTraversal(root->left);
    preorderTraversal(root->right);
  }
}


struct node *insert(struct node *node, int key) {
  // Return a new node if the tree is empty
  if (node == NULL) return newNode(key);

  // Traverse to the right place and insert the node
  if (key < node->key)
    node->left = insert(node->left, key);
  else
    node->right = insert(node->right, key);

  return node;
}

/*void k_max(struct node *root,int key){
	if(root!=NULL){

    }
}*/
int main()
{
	struct node *root;
	printf("Enter the elements of the BST \n");
	printf("Enter -1 to stop \n");
	int i,j;
	j=1;
	for(i=0;i<j;i++){
		int num;
		scanf("%d",&num);
		if (num==-1)
		   break;
		else{
			insert(root,num);
			j++;
		}
	}
	preorderTraversal(root);
	
}