class Solution {
    public int countOdds(int low, int high) {
        int sum=0;
        if(low%2==0){
        for(int i=low+1;i<=high;i+=2){
        
                sum++;
        
        }
        }
        else{
            for(int i=low;i<=high;i+=2){
            
                sum++;
            
        }
        }
        return sum;
    }
}