class Solution {
    
        List<List<Integer>> res=new ArrayList<>();
        ArrayList<Integer> ls=new ArrayList<>();
        public List<List<Integer>> combinationSum(int[] nums,int target){
            helper(nums,target,0);
            return res;
        }

        public void helper(int[] nums,int target,int start){
            if(target==0){
                res.add(new ArrayList<>(ls));
                return;
            }

            for(int i=start;i<nums.length;i++){
                if(nums[i]<=target){
                    ls.add(nums[i]);
                    helper(nums,target-nums[i],i);
                    ls.remove(ls.size()-1);
                }
            }
        
    }
}