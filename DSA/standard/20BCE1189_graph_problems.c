#include<stdio.h>
#define v 5
#define INFINITY 9999
int i,j,visited[5];
void init(int arr[][v])
{
	for(i=0;i<v;i++){
		for(j=0;j<v;j++){
			arr[i][j]=0;
		}
	}
}

void add_edge(int arr[][v],int i,int j,int w)
{
	arr[i][j]=w;
}

int count(int arr[][v])
{
	int sum=0;
	for(i=0;i<v;i++){
		for(j=0;j<v;j++){
			if(arr[i][j]!=0){
				sum++;
			}
		}
	}
	return sum;
}

int outdegree(int arr[][v])
{
	int sum=0;
	for(i=0;i<v;i++){
		printf("\nOutdegree of vertex %d is ",i);
		for(j=0;j<v;j++){
			if (arr[i][j]!=0){
				sum++;
			}
		}
		printf("%d",sum);
		sum=0;
	}
}

int indegree(int arr[][v])
{
	int sum=0;
	for(i=0;i<v;i++){
		printf("\nIndegree of vertex %d is ",i);
		for(j=0;j<v;j++){
			if (arr[j][i]!=0){
				sum++;
			}
		}
		printf("%d ",sum);
		sum=0;
	}
}

void path(int arr[v][v],int x,int y)
{
	int p=0,cost=0;
	for(i=0;i<v;i++){
		if(arr[x][i]!=0){
			cost+=arr[x][i];
			if(arr[i][y]!=0){
				cost+=arr[i][y];
				p++;
				printf("\ncost is %d\n",cost);
				printf("path is %d->%d->%d",x,i,y);
			}
		}
	}
}

int main()
{
	int arr[v][v];
	/*
	graph:
	     4
	  0------>1
	  ^       ^
	  |       |
	  |       |
	  |5      |4
	  2<------3<-----4
	       2     3
	*/
	init (arr);
	add_edge(arr,0,1,4);
	add_edge(arr,2,0,5);
	add_edge(arr,3,2,2);
	add_edge(arr,4,3,3);
	add_edge(arr,3,1,4);
	for(i=0;i<v;i++){
		for(j=0;j<v;j++){
			printf("%d ",arr[i][j]);
		}
		printf("\n");
	}
	printf("the no of edges are %d \n",count(arr));
	indegree(arr);
	printf("\n");
	outdegree(arr);
	printf("\n");
	path(arr,4,2);
}
