#include<stdio.h>
int main()
{
    int number;
    scanf("%d",&number);
    int digits[4];
    int i,count=0;
    
    for (i = 3; i >= 0; i--)
    {
        digits[i] = number % 10;
        number = number / 10;
    }
    //printf("%d\n%d\n%d\n%d\n",digits[0],digits[1],digits[2],digits[3]);
    int num1,num2;
    num1=(10*digits[0])+(digits[1]);
    num2=(10*digits[2])+(digits[3]);
    //printf("%d\n%d\n",num1,num2);
    if(num1%num2==0){
        printf("Yes");
    }
    else{
        printf("No");
    }
}