public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] A) {
        int[] ans=new int[2];
        Arrays.sort(A);
        ans[0]=0;ans[1]=0;
        try{
        for(int i=0;i<A.length-1;i++){
            
            if(A[i+1]-A[i]==2){
                ans[1]=A[i]+1;
            }
            if(A[i+1]-A[i]==0){
                ans[0]=A[i];
            }
        }
        }catch(Exception e){
            System.out.println(e);
        }
        
        if(ans[1]==0){
            if(A[0]==1){
                ans[1]=2;
            }
            else{
                ans[1]=A[0]-1;
            } 
        }
        return ans;}}