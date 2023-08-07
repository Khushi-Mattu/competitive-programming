class Solution {
    
    boolean increasing(long a[], long n)
{
    for (int i = 0; i < n - 1; i++)
        if (a[i] >= a[i + 1])
            return false;   
    return true;
}
 
// bool function for checking an array
// elements are in decreasing.
boolean decreasing(long a[], long n)
{
    for (int i = 0; i < n - 1; i++)
        if (a[i] < a[i + 1])
            return false;   
    return true;
}
 
 
    public long shortestUnorderedSubarray(long arr[], long n)
    {
        if (increasing(arr, n) == true ||
       decreasing(arr, n) == true)
        return 0;
    else
        return 3;
        
    }
}