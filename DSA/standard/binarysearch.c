#include <stdio.h>
 
// A recursive binary search function. It returns
// location of x in given array arr[l..r] is present,
// otherwise -1
int binarySearch(int arr[], int l, int r, int x)
{
    if (r >= l) {
        int mid = l + (r - l) / 2;
 
        // If the element is present at the middle
        // itself
        if (arr[mid] == x)
            return mid;
 
        // If element is smaller than mid, then
        // it can only be present in left subarray
        if (arr[mid] > x)
            return binarySearch(arr, l, mid - 1, x);
 
        // Else the element can only be present
        // in right subarray
        else
		    return binarySearch(arr, mid + 1, r, x);
    }
 
    // We reach here when element is not
    // present in array
    return -1;
}
 
int main()
{
    
    int i,num,j;
    scanf("%d",&num);
    int arr[num];
    for(j=0;j<num;j++){
        scanf("%d",&arr[j]);
    }
    //for(j=0;j<num;j++){
    //	printf("%d",arr[j]);
	//}
    int k;
    scanf("%d",&k);
    int index[k],ans[k];
    for(i=0;i<k;i++){
        scanf("%d",&index[i]);
    }
    //for(i=0;i<k;i++){
    //	printf("%d",index[i]);
	//}
    for(i=0;i<k;i++){
        ans[i]=binarySearch(arr,0,num-1,index[i]);
    }
    for(i=0;i<k;i++){
        printf("%d ",ans[i]);
    }

}
