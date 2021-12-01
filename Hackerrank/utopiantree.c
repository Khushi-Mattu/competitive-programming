#include <stdlib.h>
#include <string.h>
int main()
{
    int num,i;
    scanf("%d",&num);
    for (int i=0;i<num;i++){
        int k;
        scanf("%d",&k);
        int height=0;
        for(int j=0;j<=k;j++){
            if((j-1)%2==0){
                height*=2;
            }
            else{
                height+=1;
            }
        }
        printf("%d\n",height);
    }
    
}
