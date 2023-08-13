class Solution {
    public boolean validPartition(int[] nums) {
        int n=nums.length;
        if(n==1) return false;
        if(n==0) return true;
        boolean[] dp={true,false,nums[0]==nums[1]};
        for(int i=2;i<n;i++){
            boolean ans= (nums[i]==nums[i-1] && dp[1] ||
            nums[i]==nums[i-1] && nums[i]==nums[i-2] && dp[0] ||
            nums[i]-nums[i-1]==1 && nums[i-1]-nums[i-2]==1 && dp[0]);
            dp[0]=dp[1];
            dp[1]=dp[2];
            dp[2]=ans;
        }
        return dp[2];
    }
}