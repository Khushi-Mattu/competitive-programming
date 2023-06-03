class Solution {
    public int largestAltitude(int[] gain) {
        int[] arr=new int[gain.length+1];
        arr[0]=0;int sum=0;int max=0;
        for(int i=1;i<gain.length+1;i++){
            arr[i]=sum+gain[i-1];
            sum=arr[i];
            if(arr[i]>max){
                max=arr[i];
            }
        }

        return max;
    }
}