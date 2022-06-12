class Solution {
    public void rotate(int[] nums, int k) 
    {
       int size=nums.length;
       int[] result=new int[size];
        k=k%size;
       for(int i=0;i<k;i++)
       {
           result[i]=nums[size-k+i];
       }
        for(int i=0;i<(size-k);i++)
       {
           result[k+i]=nums[i];
       }
        for(int i=0;i<size;i++)
        {
            nums[i]=result[i];
        }
    }
}