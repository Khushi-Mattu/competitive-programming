class Solution {
    public int maxProfit(int[] prices) {
        int minPrice=prices[0];int max=Integer.MIN_VALUE;int sum=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>minPrice){
                sum+=prices[i]-minPrice;
                minPrice=prices[i];
               
            }
            else{
                minPrice=prices[i];
                
            }
            
        }
        return sum;
    }
}