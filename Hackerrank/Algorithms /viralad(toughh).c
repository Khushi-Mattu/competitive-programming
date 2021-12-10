#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
    int m=5,likes=0;
    int n,i;
    scanf("%d",&n);
    for(i=1;i<=n;i++)
    {
        likes=likes+(m/2);
        m=(m/2)*3;
    }
    printf("%d",likes);
    return 0;
}