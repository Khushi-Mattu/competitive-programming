#include<stdio.h>
#include<stdlib.h>
#define infinity 9999
int i,j,k,a,b,u,v,n,ne=1;
int min,mindist=0,cost[10][10],start[10];

int search(int i)
{
    while(start[i])
    i=start[i];
    return i;
}

int uni(int i,int j)
{
    if(i!=j)
    {
        start[j]=i;
        return 1;
    }
    return 0;
}

int main()
{
	char c1,c2;
	printf("Enter the no. of villages:");
    scanf("%d",&n);
    printf("Enter the cost adjacency matrix:\n");
    for(i=1;i<=n;i++)
    {
        for(j=1;j<=n;j++)
        {
            scanf("%d",&cost[i][j]);
            if(cost[i][j]==0)
            cost[i][j]=infinity;
        }
    }
    printf("The edges of Minimum Cost Spanning Tree are\n");
    while(ne<n)
    {
        for(i=1,min=infinity;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(cost[i][j] < min)
                {
                    min=cost[i][j];
                    a=u=i;
                    b=v=j;
                }
            }
        }
        u=search(u);
        v=search(v);
        if(uni(u,v))
        {
            c1=64+a;
            c2=64+b;
            printf("%d edge (%c,%c) =%d\n",ne++,c1,c2,min);
            mindist+=min;
        }
        cost[a][b]=cost[b][a]=infinity;
    }
    printf("\nMinimum Distance=%d",mindist);
    printf("\nMinimum Cost=%d",mindist*120);
    return 0;
}
