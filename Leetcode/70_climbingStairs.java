//Runtime: 0 ms, faster than 100.00% of Java online submissions for Climbing Stairs.

class Solution {
    public int climbStairs(int n) {
        if(n==1||n==2){
            return n;
        }
        int[] num=new int[n+1];
        num[0]=0;
        num[1]=1;
        num[2]=2;
        
        for(int i=3;i<n+1;i++){
            num[i]=num[i-1]+num[i-2];
        }
        
        return num[n];
}
}