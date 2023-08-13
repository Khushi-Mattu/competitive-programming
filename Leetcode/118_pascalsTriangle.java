class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> lis=new ArrayList<>();
        lis.add(1);
        ans.add(lis);
        for(int i=2;i<=numRows;i++){
           List<Integer> temp=new ArrayList<>();
           temp.add(1);
           for(int j=0;j<lis.size()-1;j++){
               temp.add(lis.get(j)+lis.get(j+1));
           }
           temp.add(1);
           ans.add(temp);
           lis=temp;
        }
        return ans;
    }
}