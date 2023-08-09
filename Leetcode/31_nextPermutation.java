class Solution {
    public static void swap(int n[],int i,int j) {
		int temp=n[i];
		n[i]=n[j];
		n[j]=temp;
	}
	public static void reverse(int n[],int i,int j) {
		while(i<j) {
			swap(n,i,j);
			i++;
			j--;
		}
	}
    public void nextPermutation(int[] nums) {
         if(nums==null || nums.length<=1){
             return;
         }
         int i=nums.length-2;
         while(i>=0 && nums[i]>=nums[i+1]){
             i--;
         }
         int j=nums.length-1;
         if(i>=0){
             while(nums[j]<=nums[i]){j--;}
             swap(nums,i,j);
         }
         reverse(nums,i+1,nums.length-1);

    }
}