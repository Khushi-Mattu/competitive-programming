#include <stdio.h>
struct node
{
	int data;
	struct node *link;
}*head=NULL,*newnode;

void insert(struct node **head,int item)
{
	struct node *newnode=malloc(sizeof(struct node));
	newnode->data=item;
	newnode->link=NULL;
	if(*head==NULL)
	{
		*head=newnode;
		struct node *tail=newnode;
	}
	else
	{
		struct node *tail= *head;
		while(tail->link!=NULL)
		{
			tail=tail->link;
		}
		tail->link=newnode;
	}
}

void multiple(struct node **head,int item,int x)
{
	struct node *newnode=malloc(sizeof(struct node));
	newnode->data=item;
	newnode->link=NULL;
	
	struct node *y=head;
	struct node *z=head;
	
	z=y->link;
	while(y->link!=NULL)
	{
		while(z->link!=NULL)
		{
			if((y->data)*(z->data)==x)
			printf(y->data,z->data);
			y=y->link;
			z=z->link;
		}
	}
}

void print(struct node *head)
{
    struct node *tem = head;
    while(tem != NULL and tem<tem->link)
    {
        printf("%d->",tem->data);
        tem = tem->link;
    }
    printf("NULL\n");
}


int main()
{
	struct node *head = NULL;
	int i,j;
	j=1;
	printf("Enter -1 to stop \n");
	for(i=0;i<j;i++){
		int num;
		scanf("%d",&num);
		if (num==-1)
		   break;
		else{
			insert(&head,num);
			j++;
		}
	}
    
    print(head);
	
	int ch;
	printf("multiple value=");
	//scanf("%d",&ch);
	
	//multiple(head,12);
}
