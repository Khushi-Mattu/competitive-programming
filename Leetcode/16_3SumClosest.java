class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int closest_sum = nums[0] + nums[1] + nums[2]; // initialize closest sum
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1, right = n - 1;
            while (left < right) { // two-pointer approach
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == target) { 
                    return sum;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
                if (Math.abs(sum - target) < Math.abs(closest_sum - target)) { 
                    closest_sum = sum;
                }
            }
        }
        return closest_sum;
    }
}