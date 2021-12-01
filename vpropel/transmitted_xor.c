#include<stdio.h>
#include<math.h>
int main()
{
    int num_rcvd,xor_with,actual_num;
    scanf("%d",&num_rcvd);
    scanf("%d",&xor_with);
    scanf("%d",&actual_num);
    int y,z;
    y=actual_num^xor_with;
    printf("%d\n",y);
    unsigned int a=y;
    unsigned int b=num_rcvd;
    if (y==num_rcvd){
        printf("Correct Transmission");
    }
    else{
        int k=0;
        while(k<10){
            if(b<<k==a){
                printf("%d",b);
                printf("left");
                break;
            }
            else if(b>>k==a){
                printf("%d",b);
                printf("right");
                break;
            }
            else{
                printf("%d else left\n",b<<k);
                printf("%d else right\n",b>>k);
                printf("%d aana chahiye\n",a);
                k++;
            }
        }
    }
}