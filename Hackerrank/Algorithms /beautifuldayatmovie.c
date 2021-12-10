#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include<math.h>
int findReverse(int n)
{
   int sum=0;
   while (n!=0)
   {
     sum = sum*10 + n%10;
     n /= 10;
   }
   return sum;
}
int main()
{
    int i,j,k;
    int count=0;
    scanf("%d %d %d",&i,&j,&k);
    for(int m=i;m<j+1;m++){
        if ((m-findReverse(m))%k==0){
            count++;
        }
    }
    printf("%d",count);
}