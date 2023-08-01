class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        backtrack(n,k,1,new ArrayList<>(),ans);
        return ans;
        
    }

    public void backtrack(int n,int k,int start,List<Integer> combination,List<List<Integer>> ans){
        if(combination.size()==k){
            ans.add(new ArrayList<>(combination));
            return;
        }
        for(int i=start;i<=n;i++){
            combination.add(i);
            backtrack(n,k,i+1,combination,ans);
            combination.remove(combination.size()-1);
        }

    }
}