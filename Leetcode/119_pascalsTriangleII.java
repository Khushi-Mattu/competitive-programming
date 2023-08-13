class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> lis=new ArrayList<Integer>();
        lis.add(1);
        for(int i=0;i<rowIndex;i++){
            List<Integer> temp=new ArrayList<>();
            temp.add(1);
            for(int j=0;j<lis.size()-1;j++){
                temp.add(lis.get(j)+lis.get(j+1));
            }
            temp.add(1);
            lis=temp;
        }
        return lis;
    }
}