#include <stdio.h>
#include <stdlib.h>
typedef struct node
{
	int data;
	struct node* next;
}nd;
nd *l1=NULL,*l2=NULL,*l_inter=NULL;
void sortedinsert(nd** ref,nd* new_node)
{
	nd* current;
	if (*ref == NULL || (*ref)->data>= new_node->data)
    {
		new_node->next = *ref;
		*ref = new_node;
	}
	else
    {
		current = *ref;
		while (current->next != NULL && current->next->data < new_node->data)
			current = current->next;
		new_node->next = current->next;
		current->next = new_node;
	}
}
nd* newNode(int new_data)
{
	nd* new_node= (nd*)malloc(sizeof(nd));
	new_node->data = new_data;
	new_node->next = NULL;
	return new_node;
}
void common(int n,int p,nd* l1,nd* l2)
{
    nd* temp1=l1;
    int i,j;
    for (i=0; i<n; i++)
    {
        nd* temp2=l2;
        for ( j=0; j<p; j++)
        {
            if(temp1->data==temp2->data)
            {
                nd* new_node = newNode(temp1->data);
                sortedinsert(&l_inter, new_node);
                break;
            }
            else
                temp2= temp2->next;
        }
        temp1=temp1->next;
    }
}
void printList(nd* node)
{
	nd* temp = node;
	while (temp != NULL)
    {
		printf("%d ", temp->data);
		temp = temp->next;
	}
}
int main()
{
    int n=1;
    printf("Enter -999 to stop\n");
    printf("First List:\n");
    int i;
    for(i=0; i<n; i++)
    {
        int x;
        printf("Enter Element: ");
        scanf("%d",&x);
        if(x==-999)
            break;
        else
        {
            nd* new_node = newNode(x);
	        sortedinsert(&l1, new_node);
            n++;
        }
    }
    n--;
    printf("Second List:\n");
    int p=1;
    for(i=0; i<p; i++)
    {
        int x;
        printf("Enter Element: ");
        scanf("%d",&x);
        if(x==-999)
            break;
        else
        {
            nd* new_node = newNode(x);
	        sortedinsert(&l2, new_node);
            p++;
        }
    }
    p--;
    printf("Common elements of both the lists are: ");
    common(n,p,l1,l2);
	printList(l_inter);
	return 0;
}
