class Solution {
    public int longestPalindromeSubseq(String s) {
        int n=s.length();
        int[][] dp=new int[n+1][n+1];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                dp[i+1][j+1]=(s.charAt(i)==s.charAt(n-1-j)?dp[i][j]+1:Math.max(dp[i+1][j],dp[i][j+1]));
        return dp[n][n];
    }
}