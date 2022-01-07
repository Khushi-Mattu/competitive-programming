#include<stdio.h>
#include<stdlib.h>
#include<string.h>

struct node
{
    double balance;
    char account[100];
    struct node *prev;
    struct node *next;
}*head = NULL,*tail = NULL;

void insertion()
{
    int amount;
    char acc_name[10];
    struct node *newnode;
    newnode = (struct node *)malloc(sizeof(struct node));
    printf("Enter the account number : \n");
    scanf("%s",acc_name);
    printf("Enter the balance : \n");
    scanf("%d",&amount);
    newnode->balance = amount;
    strcpy(newnode->account,acc_name);
    newnode->next = NULL;
    newnode->prev = NULL;
    if(head == NULL)
    {
        head = newnode;
        tail = head;
    }
    else
    {
        tail->next = newnode;
        newnode->prev = tail;
        tail = newnode;
    }
}

void display()
{
    struct node *temp;
    if(head == NULL)
    {
        printf("The linked list is empty \n");
    }
    else{
        temp = head;
        while(temp != NULL)
        {
            printf("Account number : %s , Balance : %lf \n",temp->account,temp->balance);
            temp = temp->next;
        }
    }
}

void check_balance()
{
    struct node *temp;
    if(head == NULL)
    {
        printf("The linked list is empty \n");
    }
    else{
        temp = head;
        printf("The customers having balance > 1500 are : \n");
        while(temp != NULL)
        {
            if(temp->balance > 1500)
            { 
                printf("Account number : %s , Balance : %lf \n",temp->account,temp->balance);
                temp = temp->next;
            }
            else{
                temp = temp->next;
            }
        }
    }

}

void delete()
{
    struct node *temp;
    char acc_name[10];
    printf("Enter the account number of the customer to be deleted : ");
    scanf("%s",acc_name);
    if(head == NULL)
    {
        printf("The linked list is empty \n");
    }
    else{
        temp = head;
        if((strcmp(temp->account,acc_name)==0))
        {
            head = head->next;
            free(temp);
        }
        else{
            struct node *previous;
            while(temp->next != NULL)
            {
                previous = temp;
                temp = temp->next;
                if((strcmp(temp->account,acc_name)==0))
                {
                    previous->next = temp->next;
                    temp->next->prev = temp->prev;
                    free(temp);
                }
            }
        }
    }
}

int main()
{
    struct node *head = NULL;
    int i,n;
    printf("Enter the number of accounts to be added in the bank : ");
    scanf("%d",&n);
    for( i=0;i<n;i++)
    {
        insertion();
    }
    check_balance();
    delete();
    display();
    return 0;
}
