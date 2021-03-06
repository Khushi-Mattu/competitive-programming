#include<stdio.h>
#include<ctype.h> // for isdigit and isalpha
#include<string.h>
#define max 10
char stack[max];
int top=-1;
void push(char item)
{
	if (top>=max-1){
		printf("stack is full");
	}
	else{
		top=top+1;
		stack[top]=item;
	}
}
char pop()
{
	char item;
	if (top<0){
		printf("stack is empty");
	}
	else{
		item = stack[top];
		top = top-1;
		return(item);
	}
}
int priority(char operat)
{
	if(operat == '^') // operator with the highest priority
	{
		return(3);
	}
	else if(operat == '*' || operat == '/')
	{
		return(2);
	}
	else if(operat == '+' || operat == '-')          
	{
		return(1);
	}
	else
	{
		return(0);
	}
}
void InfixToPostfix(char infix[],char postfix[])
{
	int i, j;
	char oper;
	char x;

	push('(');                               // push '(' onto stack 
	strcat(infix,")");                  // add ')' to infix expression

	i=0;
	j=0;
	oper=infix[i];         // initialize before loop
	while (oper!='\0'){ // till the expression ends
		if (oper=='('){
			push(oper);
		}
		else if(isdigit(oper)||isalpha(oper)){
			postfix[j]=oper;
			j++;
		}
		else if(oper==')'){
			x = pop();                   // pop and keep popping till ( comes
			while(x != '(')             
			{
				postfix[j] = x;
				j++;
				x = pop();
			}
		}
		else{
			x=pop();
			while(priority(x)>=priority(oper))
			{
				postfix[j] = x;      // so popping all higher priority ones and adding them to postfix 
				j++;
				x = pop();                  
			}
			push(x);

			push(oper);                 //push current oprerator symbol onto stack 
		}
		i++;
		oper= infix[i];
		postfix[j] = '\0';
		
	}
	
}
void evaluation(char postfix[max])
{

    int i,a,b;
    char item;
    int val;
    for (i = 0; postfix[i] != '\0'; i++) {
        item = postfix[i];
        if (isdigit(item)) {// if it is an operand,push the digit onto stack 
		//ch - '0' is used for getting digit rather than ASCII code of digit 
            push(item - '0');
        }
        else if (item== '+' || item== '-' || item== '*' || item== '/') {
            //since we saw an operator, we will the pop the top 2 elements and use the operator on them
            a = pop();
            b = pop();
            switch (item) //the item here is an operator
            {
            case '*':
                val = b * a;
                break;

            case '/':
                val = b / a;
                break;

            case '+':
                val = b + a;
                break;

            case '-':
                val = b- a;
                break;
            }
            push(val);  // push the value obtained above onto the stack 
        }
    }
    printf("evaluation of the postfix expression : \n%d ", pop()); 
	//the top element will be the value of our evaluated expression
}
int main()
{
	char infix[max], postfix[max];      
	printf("Enter the infix expression : \n");
	gets(infix);

	InfixToPostfix(infix,postfix);                   
	printf("The postfix expression is: \n");
	puts(postfix);
	evaluation(postfix);                 
	return 0;
}
