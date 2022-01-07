#include<stdio.h>
long long int i;
long long int bubbleSort(long long int arr[], long long int n)
{
    long long int i, j, temp, flag=0;
    for(i = 0; i < n; i++)
    {
        for(j = 0; j < n-i-1; j++)
        {
            if( arr[j] > arr[j+1])
            {
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                flag = 1;
            } 
        }
        if(flag==0)
        {
            break;
        }
    }
}

  
long long int idk(long long int per[],long long int n,long long int w)
{
    long long int sum=0;
    for(i=n-1;i>0;i--){
            if(w%per[i]!=0){
                n--;
                sum=w/per[i]+idk(per,n,w);
                }
            else{
                return sum;
            }
            }
}
long long int knap(long long int val[],long long int wt[],long long int n,long long int w){
    long long int per[n];
    for(i=0;i<n;i++){
        per[i]=val[i]/wt[i];
    }
    bubbleSort(per,n);
    if (w%per[n-1]==0){
        return w/per[n];
    }
    else{
        idk(per,n,w);
    }
    
}
int main()
{
    long long int n,w;
    scanf("%d %d",&n,&w);
    long long int i,val[n],wt[n];
    for(i=0;i<n;i++){
        scanf("%d %d",&val[i],&wt[i]);
    }
    printf("%d",knap(val,wt,n,w));

}
