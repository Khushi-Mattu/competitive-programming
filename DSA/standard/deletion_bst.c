#include <stdio.h>
#include <stdlib.h>
 
struct node {
    int key;
    struct node *left, *right;
};
struct node* newNode(int item)
{
    struct node* temp
        = (struct node*)malloc(sizeof(struct node));
    temp->key = item;
    temp->left = temp->right = NULL;
    return temp;
}
 
void inorder(struct node* root)
{
    if (root != NULL) {
        inorder(root->left);
        printf("%d \n", root->key);
        inorder(root->right);
    }
}

struct node* insert(struct node* node, int key)
{
    if (node == NULL)
        return newNode(key);
 
    if (key < node->key)
        node->left = insert(node->left, key);
    else
        node->right = insert(node->right, key);
 
    return node;
}
 
struct node* deleteNode(struct node* root, int key)
{
    if (root == NULL)
        return root;
        // node with only one child or no child
    if (root->left == NULL) {
        struct node* temp = root->right;
        free(root);
        return temp;
    }
    else if (root->right == NULL) {
        struct node* temp = root->left;
        free(root);
        return temp;
    }
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
    printf("Inorder traversal of the given tree \n");
    inorder(root);
    printf("enter which node to be deleted: \n");
    int y;
    scanf("%d",&y);
    root = deleteNode(root,y);
    if(n==1){
    	printf("Inorder traversal of the modified tree \n");
    	printf("no node left");
	}
	else{
		printf("Inorder traversal of the modified tree \n");
		inorder(root);
	}
    return 0;
}
