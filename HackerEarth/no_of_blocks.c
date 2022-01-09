/*
// Sample code to perform I/O:
#include <stdio.h>

int main(){
	int num;
	scanf("%d", &num);              			// Reading input from STDIN
	printf("Input number is %d.\n", num);       // Writing output to STDOUT
}

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
*/

// Write your code here
#include <stdio.h>
int gcd(int a,int b)
{
	int c;
	if(b==0){
		return a;
	}
	else{
		c=a%b;
		gcd(b,c);
	}
}
int main(){
	int num;
	scanf("%d",&num);              			// Reading input from STDIN
	int i,j;     // Writing output to STDOUT
	int n[num],sum[num];
	for(i=0;i<num;i++){
		scanf("%d",&n[i]);
		int arr[n[i]];
		for(j=0;j<n[i];j++){
			scanf("%d",&arr[j]);
		}
		sum[i]=0;
		int k=0;
		while(k<n[i]){
			sum[i]+=gcd(arr[j],arr[j+1]);
			k++;
		}
	}
	for(i=0;i<num;i++){
		printf("%d",sum[i]);
	}
}