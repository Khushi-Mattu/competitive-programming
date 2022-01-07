#include <stdio.h>
#include<stdlib.h>
#include<string.h>
struct node
{
    char name[15];
    int price;
    struct node*link;
};
struct node *head,*newptr,*temp,*temp1,*prev;
void create() 
{
    newptr=(struct node *)malloc(sizeof(struct node));
    if(newptr==NULL)
        printf("\nOverflow");
    else
    {
        char p[15];
        int pr;
        printf("\nEnter the name of the product: ");
        scanf("%s",p);
        printf("\nEnter the price of the product: ");
        scanf("%d",&pr);
        strcpy(newptr->name,p);
        newptr->price=pr;
        newptr->link=NULL;
        if(head==NULL)
        {
            head=newptr;
            temp=newptr;
        }
        else
        {
            temp->link=newptr;
            temp=temp->link;
        }
    }
}
void delete()
{
    char str[15];
    printf("\nEnter the name of product which is sold: ");
    scanf("%s",str);
    if(head==NULL)
        printf("\nList is empty");
    else
    {
        temp1=head;
        if(strcmp(temp1->name,str)==0)
        {
            head=head->link;
            free(temp1);
        }
        else
        {
            while(temp1!=NULL)
            {
                prev=temp1;
                temp1=temp1->link;
                if(strcmp(temp1->name,str)==0)
                {
                    prev->link=temp1->link;
                    free(temp1);
                    printf("\nDeleted");
                }
            }
        }
    }
}
void display() 
{
    temp=head;
    if(head==NULL)
        printf("\nThe list is empty!");
    else
    {
        while(temp!=NULL)
        {
            printf("\n%s : %d ",temp->name,temp->price);
            temp=temp->link;
        }
    }
}
int main()
{
    int ch;
    do
    {
        printf("\n1.Insert\t2.Display\t3.Delete\t4.Exit");
        printf("\nEnter your choice: ");
        scanf("%d",&ch);
        switch(ch)
        {
            case 1: create();
                    break;
            case 2: printf("\nThe elements are:\n ");
                    display();
                    break;
            case 3: delete();
                    break;
            case 4: printf("\nExiting!!!");
                    exit(0);
            default: printf("\nInvalid entry");
        }
    }while(ch>=1 && ch<=4);
    return 0;
}
