class Solution {
    public int pivotIndex(int[] nums) {
        if(nums.length < 1)
            return -1;
        
        //lsum is sum of all elems on left, rsum is sum of all elems on right of current elemt
        int rsum=0, lsum=0;
        
        //calculating sum of the array
        for(int num: nums)    
            rsum = rsum + num;
        
        //Iterate all elements,and calculate lsum and rsum
        //After subtracting ith elem check if left and right sum are equal 
        //If not equal, then add num[i] to lsum
        //We subtract nums[i] from rsum, and then check 
        for(int i=0; i<nums.length; i++)
        {
            rsum = rsum - nums[i];
            if(rsum == lsum) 
                return i;  //found the pivot index
            lsum = lsum + nums[i];
        }
        return -1;
    }
}
/*
class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int i=1;i<nums.length;i++){
            sum+=nums.length;
        }
        if(sum==0){
            return 0;
        }
        int sums=0;
        for(int i=0;i<nums.length;i++){
            sums=nums.length;
        }
        if(sums==0){
            return nums.length-1;
        }
        
        for(int i=0;i<nums.length;i++){
            int sum1=0;
            int sum2=0;
            for(int j=0;j<i;j++){
                sum1+=nums[j];
            }
            for(int k=i+1;k<nums.length;k++){
                sum2+=nums[k];
            }
            if(sum1==sum2){
                return i;
            }
        }
        return -1;
    }
}