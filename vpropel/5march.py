 #include<iostream>
#include<stdlib.h>
using namespace std;

int present(int elem,int ar[20],int n)
{
	int i,flag=0;
	for (i=0;i<n;i++)
	{
		if (elem==ar[i])
		{
			flag=1;
			return flag;
		}
	}
}

int occ(int elem, int n, int a[20], int b[20])
{
	int occa=0,occb=0,i;
	for (i=0;i<n;i++)
	{
		if (elem==a[i])
			occa++;
	}
	for (i=0;i<n;i++)
	{
		if (elem==b[i])
			occb++;
	}
	if (occa==occb)
		return 1;
	else
		return 0;
}

int main()
{
	int m,n,i,j;
	cin>>m;
	cin>>n;
	int mat[m][n];
	for (i=0;i<m;i++)
	{
		for (j=0;j<n;j++)
		{
			cin>>mat[i][j];
		}
	}
	
	int sample[n],indi[n];
	
	for (i=0;i<n;i++)
	{
		sample[i]=mat[0][i];
	}
	
	for (i=0;i<m;i++)
	{
		for (j=0;j<n;j++)
		{
			indi[j]=mat[i][j];
		}
		for (j=0;j<n;j++)
		{
			if (present(mat[i][j],sample,n)==0 || occ(mat[i][j],n,indi,sample)==0)
			{
				cout<<"Not Shuffled Row Matrix";
				exit(0);
			}
			
		}
	}
	cout<<"Shuffled Row Matrix";
	return 0;
	
}

python

 import sys

m=int(input())
n=int(input())
mat=[]
for i in range(m):
    l=input().split()
    mat.append(l)
        
#print(mat)

sample=mat[0]

for x in mat:
    for y in x:
        if y not in sample or x.count(y)!=sample.count(y):
            print("Not Shuffled Row Matrix")
            sys.exit(0)

print("Shuffled Row Matrix")