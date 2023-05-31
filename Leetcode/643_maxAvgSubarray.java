class Solution {
    public double findMaxAverage(int[] arr, int k) {
        double currentSum = 0;
        double currentAvg = 0;
        double maxAvg = Integer.MIN_VALUE;

        for (int i=0; i<arr.length; i++){
            currentSum += arr[i];
            if(i >= (k-1)){
                currentAvg = currentSum/k;
                maxAvg = Math.max(maxAvg, currentAvg);
                currentSum -= arr[i-(k-1)];
            }
        }
        return maxAvg;
    }
}