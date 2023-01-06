class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int ice=0; int c=0;
        if(costs[0]>coins){
            return 0;
        }
        while(ice<costs.length && c<coins){
            c+=costs[ice];
            if(c>coins){
                return ice;
            }
            ice++;
        }
        return ice;
    }
}