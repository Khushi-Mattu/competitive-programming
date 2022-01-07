/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>
void sum(int max,int pos)
{
    int s=0;
    do
    {
        int r=max%10;
        s+=r;
    }while(max/10);
    if(s==pos)
    {
        printf("\nMatching");
    }
    else
    {
        printf("\nNot Matching");
    }
}

int main()
{
    int n;
    printf("Size:");
    scanf("%d",&n);
    int arr[n];
    printf("\nArray elements:\n");
    int i;
    for(i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }
    int i=0;
    int k,pos;
    int max=0;
    printf("\nPosition:");
    scanf("%d",&k);
    while(i<k)
    {
        for(int j=0;j<n;j++)
        {
            if(max<arr[j]){
            max=arr[j];
            pos=j;
        }
        }
        if(i==k-1)
        {
            break;
        }
        else
        {
            max=0;
        }
        i++;
    }
    printf("%d",max);
    sum(max,pos);

    return 0;
}
