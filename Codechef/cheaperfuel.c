#include<stdio.h>
int main()
{
    int num,i;
    scanf("%d",&num);
    int x[num],y[num],a[num],b[num],k[num];
    for(i=0;i<num;i++){
        scanf("%d %d %d %d %d",&x[i],&y[i],&a[i],&b[i],&k[i]);
    }
    int petrol[num],diesel[num];
    for(i=0;i<num;i++){
        petrol[i]=x[i]+(a[i]*k[i]);
        diesel[i]=y[i]+(b[i]*k[i]);
        if(petrol[i]>diesel[i]){
            printf("DIESEL\n");
        }
        else if(petrol[i]<diesel[i]){
            printf("PETROL\n");
        }
        else{
            printf("SAME PRICE\n");
        }
    }
}