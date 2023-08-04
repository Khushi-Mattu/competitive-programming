class Solution {
    // Function to return the position of the first repeating element.
    public static int firstRepeated(int[] arr, int n) {
        // Your code here
        HashSet<Integer> set=new HashSet<>();
        
        int[] nums=new int[1000000];
        for (int i:nums){
            i=0;
        }
        for(int i=0;i<n;i++){
            nums[arr[i]]++;
        }
        //int min=Integer.MAX_VALUE;
        
        for(int i=0;i<n;i++){
            if(nums[arr[i]]>1){
                return i+1;
            }
        }
        return -1;
        
        
    }
}
