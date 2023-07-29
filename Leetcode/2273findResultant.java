class Solution {
    public List<String> removeAnagrams(String[] words) {
        
        String prev="";
        List<String> ans=new ArrayList<>();
        for(String str: words){
            char[] ch=str.toCharArray();
            Arrays.sort(ch);
            String temp=new String(ch);
            if(!temp.equals(prev)){
                ans.add(str);
                prev=temp;
            }
        }
        
        
        return ans;
    }
}