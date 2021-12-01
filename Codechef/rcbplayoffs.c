#include<stdio.h>
int main()
{
    int num;
    scanf("%d",&num);
    int i,x[num],y[num],z[num];
    for(i=0;i<num;i++){
        scanf("%d",&x[i]);
        scanf("%d",&y[i]);
        scanf("%d",&z[i]);
    }
    for(i=0;i<num;i++){
        if(x[i]+z[i]*2>=y[i]){
            printf("yes\n");
        }
        else{
            printf("no\n");
        }
    }
}