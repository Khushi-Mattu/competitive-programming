/*
class Solution {
    public int searchInsert(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int mid=0;
        int ans=0;
        while(low<=high){
            mid=low+(high-low)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            if(nums[mid]<target)
            {
                low=mid+1;
            }
            if(nums[mid]>target)
            {
                high=mid-1;
            }
        }
        if(target>nums[nums.length-1])
        {
            return nums.length;
        }
        if(target<nums[0])
        {
            return 0;
        }
        for(int i=1;i<nums.length;i++)
        {
            
            if(nums[i]>target && nums[i-1]<target)
            {
                ans=i;
            }
        }
        return ans;
        
    }
}
*/


//Faster Solution 

class Solution {
    public  int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0 || target < nums[0]) return 0;

        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i])
                return i;
            if (i == nums.length - 1 || nums[i] < target && nums[i + 1] > target)
                return i + 1;
        }
        return -1;
    }
}