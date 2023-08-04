class Solution {
    
        List<List<Integer>> res=new ArrayList<>();
        
        public List<List<Integer>> combinationSum2(int[] nums,int target){
            
            Arrays.sort(nums);
            ArrayList<Integer> ls=new ArrayList<>();
            helper(nums,target,0,ls);
            return res;
        }

        public void helper(int[] nums,int target,int start,ArrayList<Integer> ls){
            if(target==0){
                //if(!res.contains(new ArrayList<>(ls))){
                res.add(new ArrayList<>(ls));
                return;
            }
            for(int i=start;i<nums.length;i++){
                if (i>start && nums[i]==nums[i-1]){
                    continue;
                }
                if(nums[i]<=target){
                    ls.add(nums[i]);
                    helper(nums,target-nums[i],i+1,ls);
                    ls.remove(ls.size()-1);
                }
            }
        
    }
}