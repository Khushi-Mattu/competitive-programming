class Solution {
    public int maxProfit(int[] prices) {
        int result = 0, minPrice = prices[0];
        for(int price: prices){
            minPrice = Math.min(price, minPrice);
            result = Math.max(result, price - minPrice);
        }
        return result;
    }
}

/*----------------------------------------------------------------
Time Limit Exceeded

class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                if(prices[j]-prices[i]>max){
                    max=prices[j]-prices[i];
                }
            }
        }
        return max;
    }
}