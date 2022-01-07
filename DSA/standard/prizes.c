#include<stdio.h>
#include<string.h>
#define max 9999999
long long int stack[max];
long long int top=-1;
void push(long long int item)
{
	if (top>=max-1){
		printf("stack is full");
	}
	else{
		top=top+1;
		stack[top]=item;
	}
}
long long int pop()
{
	long long int item;
	if (top<0){
		printf("stack is empty");
	}
	else{
		item = stack[top];
		top = top-1;
		return(item);
	}
}
void Solve(long long int n) {
    long long int i;
    long long int K = 0;
    for (i = 1; n; i++) {
        if (n - i > i) {
            push(i);
            K++;
            n -= i;
    } else {
      push(n);
      K++;
      break;
    }
  }
   printf("%d\n",K);
  for (i = 0; i < max; i++) {
      if(stack[i]!=0){
    printf("%d ",stack[i]);
      }
      else{
          break;
      }
  }
}
long long int main()
{
    long long int n;
    scanf("%d",&n);
    long long int i;
    Solve(n);
}
