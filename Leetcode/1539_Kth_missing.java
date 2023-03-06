class Solution {
    public int findKthPositive(int[] arr, int k) {
        int ans=0;
        int[] arr2=new int[arr[arr.length-1]+k];
        for(int i=0;i<arr2.length;i++){
            arr2[i]=0;
        }
        for(int i=0;i<arr.length;i++){
            arr2[arr[i]-1]=arr[i];
        }
        int count =0;
        for(int i=0;i<arr2.length;i++){
            if(arr2[i]==0){
                count++;
            }
            if(count==k){
                ans+=i;
                ans+=1;
                i=arr2.length;
            }
       
        }
        return ans;
    }
}