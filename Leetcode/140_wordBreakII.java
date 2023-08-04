class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        StringBuilder temp=new StringBuilder();
        List<String> lis=new ArrayList<>();
        helper(lis,temp,s,wordDict,0);
        return lis;
        
    }

    public void helper(List<String> lis, StringBuilder temp,String s, List<String> wordDict,int start){
        if(start==s.length()){
            lis.add(temp.toString().trim());
            return;
        }

        for(int end=start;end<s.length();end++){
            String word=s.substring(start,end+1);
            if(wordDict.contains(word)){
                temp.append(word+" ");
                helper(lis,temp,s,wordDict,end+1);
                temp.delete(temp.length()-word.length()-1,temp.length());
            }
        }
        return;
    }
}