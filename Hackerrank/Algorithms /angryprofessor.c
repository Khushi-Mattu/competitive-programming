#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int main(){
    int t; 
    scanf("%d",&t);
    long int n,k;
    long int a[1000];
    for(int a0 = 0; a0 < t; a0++){
        scanf("%ld %ld",&n,&k);
       long int neg=0;
        for(int i = 0; i < n; i++){
           scanf("%ld",&a[i]);
           if(a[i]<=0)
               neg=neg+1;
        }
        if(neg>=k)
            printf("NO\n");
        else
            printf("YES\n");
    }
    return 0;
}