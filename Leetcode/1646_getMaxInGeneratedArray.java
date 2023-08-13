class Solution {
    public int getMaximumGenerated(int n) {
        int[] nums=new int[n+1];
        int max=Integer.MIN_VALUE;
        if(n==0 || n==1){
            return n;
        }
        nums[0]=0;
        nums[1]=1;
        for(int i=2;i<=n;i++){
            if(i%2==0){
                nums[i]=nums[i/2];
                
            }
            else{
                nums[i]=nums[i/2]+nums[i/2+1];
               
            }
            
            max=Math.max(max,nums[i]);
            //System.out.println(nums[i]+" "+max);
        }
        return max;
    }
}