#include<stdio.h>
int gcd_num(int arr[],int n)
{
    int gcd=arr[0];
    int j=1;
    while(j<n)
    {
       if(arr[j]%gcd==0)
       {
           j++;
       }
       else
       {
           gcd=arr[j]%gcd;
           j++;
       }
    }

}

int main()
{
    int num,n,i,j,k,l;
    int c[100];
    scanf("%d",&num);
    for(i=0;i<num;i++){
        scanf("%d",&n);
        int arr[n];
        int count=0;
        for(j=0;j<n;j++){
            scanf("%d",&arr[j]);
        }
        for(j=0;j<n;j++){
            do{
                arr[j]=arr[j]/2;
                count++;
            }while((gcd_num(arr,n))%2==0);
            count=c[j];
        }
        }
        for(j=0;j<n;j++){
            printf("%d\n",c[j]);
        }
        
}
