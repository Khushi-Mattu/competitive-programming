#include<stdio.h>
int main()
{
    int num;
    scanf("%d",&num);
    int i,j,k,l[num],m[num],n[num];
    for(i=0;i<num;i++){
        scanf("%d",&n[i]);
        scanf("%d",&m[i]);
        scanf("%d",&l[i]);
        int c[n[i]],t[n[i]];
        for (j=0;j<n[i];j++){
            scanf("%d",&c[j]);
        }
        for (k=0;k<n[i];j++){
            scanf("%d",&t[k]);
        }

    }
}