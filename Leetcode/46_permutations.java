class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        dfs(new ArrayList<>(),new boolean[nums.length],ans,nums);
        return ans;
    }
    public static void dfs(List<Integer> path,boolean[] used,List<List<Integer>> ans,int[] nums){
        if(path.size()==used.length){
            ans.add(new ArrayList<>(path));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]) continue;
            path.add(nums[i]);
            used[i]=true;
            dfs(path,used,ans,nums);
            path.remove(path.size()-1);
            used[i]=false;
            
        }
    }
}