#include<stdio.h>
#define max 11
int rear=-1;
int front=-1;
int queue[max];

void insert(item)
{
	if (rear==(max-1)){
		printf("queue is full\n");
	}
	else{
		rear=rear+1;
		queue[rear]=item;
	}
}
void delete()
{
	if (front==rear){
		printf("queue is empty\n");
	}
	else{
		front=front+1;
	}
}
void display()
{
	int i;
	if (front==rear){
		printf("queue is empty\n");
	}
	else{
		for(i=front+1;i<=rear;i++){
			printf("%d\n",queue[i]);
		}
	}
}
int main()
{	
   insert(20);
   insert(21);
   insert(22);
   insert(23);
   insert(24);
   insert(25);
   insert(26);
   insert(27);
   insert(28);
   insert(29);
   insert(30);
   display();
   delete();
   delete();
   printf("after deletion \n");
   display();
}
