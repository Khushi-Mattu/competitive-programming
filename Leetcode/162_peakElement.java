class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length == 1) return 0; // single element
        int n=nums.length;
        // check if 0th/n-1th index is the peak element
        if(nums[0] > nums[1]) return 0;
        if(nums[n-1] > nums[n-2]) return n-1;

        int low=1;int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid-1]<nums[mid] && nums[mid+1]<nums[mid]){
                return mid;
            }
            else if(nums[mid-1]>nums[mid]){
                high=mid-1;
            }
            else if(nums[mid+1]>nums[mid]){
                low=mid+1;
            }
        }
        return -1;
    }
}