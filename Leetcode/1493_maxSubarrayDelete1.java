class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0, zero = 0;
        int size = nums.length, ans = 0;

        for(int right = 0; right < size; right++){
            if(nums[right] == 0 ) zero++;
            if(zero > 1){
                if(nums[left] == 0) zero--;
                left++;
            }
            if(zero <= 1) ans = Math.max(ans, right-left+1);
        }
        return ans-1;
    }
}