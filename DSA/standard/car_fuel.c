
#include<stdio.h>
int main()
{
    long long d,m,n,i,nr=0,cr=0,lr; //cr=currentrefill, 
    scanf("%lld",&d);       // m=max. distance by the car in a full tank
    scanf("%lld",&m);
    scanf("%lld",&n);
    long long a[n+1];              //lr=lastrefill , nr=no. of refills
    a[0]=0;                        // array a represents gas stations positions 
    for(i=1;i<=n;i++)
    {
        scanf("%lld",&a[i]);
    }
    a[n+1]=d;
    while(cr<=n)                         
    {                                   
        lr=cr;
        while(cr<=n && a[cr+1]-a[lr]<=m)
        {
            cr=cr+1;
        }
        if(cr==lr)
        {
            printf("-1");
            break;
        }
        if(cr<=n)
        {
            nr=nr+1;
        }
    }
    if(cr!=lr)
    {
    printf("%lld",nr);
    }
}

