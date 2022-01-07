#include<stdio.h>
#include<stdlib.h>

struct node
{
    int data;
    struct node *next;
};

void create(struct node *head,int item)
{
	struct node *newnode,*head;
    newnode=(struct node*)malloc(sizeof(struct node));
    newnode-> data=item;
    newnode->next=NULL;
    struct node *temp;
    if(head==NULL)
    {
        head=newnode;
        temp=newnode;
    }
    else
    {
        temp->next=newnode;
        temp=temp->next;
    }
}

void display(struct node* head)
{
    struct node *temp=head;
    if(head==NULL)
    {
        printf("list empty \n");
    }
    else
    {
        while(temp!=NULL)
        {
            printf("%d \n",temp->data);
            temp=temp->next;
        }
    }
}


void removeDuplicates(struct node* start)
{
    struct node *ptr1, *ptr2, *dup,*root1,*root2;
    ptr1 = start;

    
    while (ptr1 != NULL && ptr1->next != NULL) {
        ptr2 = ptr1;
        while (ptr2->next != NULL) {
            if (ptr1->data == ptr2->next->data) {
            	create(root1,ptr1->data);
                ptr2->next = ptr2->next->next;
                
            }
            else{
            	create(root2,ptr1->data);
                ptr2 = ptr2->next;
            }
        }
        ptr1 = ptr1->next;
    }
}

int main()
{
	struct node *root,*p,*prev;
	int i,j;
	j=1;
	printf("enter the elements of the linked list: \n");
	printf("Enter -1 to stop \n");
	for(i=0;i<5;i++){
		int num;
		scanf("%d",&num);
		
		create(root,num);
			
		
	}
	display(root);
	//removeDuplicates(root);
}
