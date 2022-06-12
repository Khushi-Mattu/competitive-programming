class Solution {
    public void moveZeroes(int[] nums) {
        int current_index = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] != 0){
                nums[current_index] = nums[i];
                current_index++;
            }
        }
        for(int i = current_index;i<nums.length;i++){
            nums[i] = 0;
        }
    }
}