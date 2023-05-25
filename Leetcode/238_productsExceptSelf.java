class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product=1;int product2=1;
        int[] newArr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                product2=product;
            }
            else{
                product2*=nums[i];
            }    
            product*=nums[i];
                
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                newArr[i]=product2;
                break;
            }
            newArr[i]=product/nums[i];
        }
        return newArr;

    }
}