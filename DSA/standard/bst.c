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

// preorder Traversal
void preorderTraversal(struct node *root) 
{
  if (root != NULL) 
  {
    printf("%d  ", root->key);
    preorderTraversal(root->left);
    preorderTraversal(root->right);
  }
}

struct node *insert(struct node *node, int key) 
{
  // Return a new node if the tree is empty
  if (node == NULL) return newNode(key);

  if (key < node->key)
    node->left = insert(node->left, key);
  else
    node->right = insert(node->right, key);

  return node;
}
void inorderTraversal(struct node *root) {
  if (root != NULL) {
    inorderTraversal(root->left);
    printf("%d ", root->key);
    inorderTraversal(root->right);
  }
}
//k_max
void kth_max(struct node *root, int k)
{
    static int count = 0;
    if (root == NULL)
        return;
 
    if (count <= k) {
 
        /* first recur on left child */
        kth_max(root->left, k);
        count++;
 
        // when count = n then print element
        if (count == k)
            printf("%d ", root->key);
 
        /* now recur on right child */
        kth_max(root->right, k);
    }
}
int main()
{
	struct node *root=NULL;
	printf("Enter the elements of the BST \n");
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
	printf("The Preorder Traversal is :\n");
	preorderTraversal(root);
	printf("\nThe Inorder Traversal is :\n");
	inorderTraversal(root);
	printf("\nEnter k value: \n");
	int k;
	scanf("%d",&k);
	printf("the %d largest element is :",k);
	kth_max(root,k);
}
