#include<stdio.h>
#define max 11
int rear=-1;
int front=-1;
int queue[max];

void insert(item)
{
	if(front==-1 && rear==-1)   
    {  
        front=0;  
        rear=0;  
        queue[rear]=item;  
    }  
    else if((rear+1)%max==front)  
    {  
        printf("Queue is full \n");  
    }  
    else  
    {  
        rear=(rear+1)%max;       
        queue[rear]=item;     
    }  
}
void delete()
{
	 if((front==-1) && (rear==-1)) 
    {  
        printf("Queue is empty\n");  
    }  
 else if(front==rear)  
{  
   front=-1;  
   rear=-1;  
}   
else  
{   
   front=(front+1)%max;  
}  
}
void display()  
{  
    int i=front;  
    if(front==-1 && rear==-1)  
    {  
        printf("Queue is empty\n");  
    }  
    else  
    {  
        while(i<=rear)  
        {  
            printf("%d \n", queue[i]);  
            i=(i+1)%max;  
        }  
    }  }
int main()
{	
   insert(10);
   insert(11);
   insert(12);
   insert(13);
   insert(14);
   insert(15);
   insert(16);
   insert(17);
   insert(18);
   insert(19);
   insert(20);
   display();
   delete();
   printf("after deletion \n");
   display();
}

