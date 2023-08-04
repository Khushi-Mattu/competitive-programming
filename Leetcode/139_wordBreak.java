class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashMap<String,Boolean> mp=new HashMap<>();
        HashSet<String> set=new HashSet<>(wordDict);
        return dfs(s,mp,set);
        
    }

    public boolean dfs(String s, HashMap<String,Boolean> mp, HashSet<String> set){
        if(mp.containsKey(s)) return mp.get(s);
        if(set.contains(s)) return true;
        for(int i=1;i<s.length();i++){
            String prefix=s.substring(0,i);
            if(set.contains(prefix) && dfs(s.substring(i),mp,set)){
                mp.put(s,true);
                return true;
            }
        }
        mp.put(s,false);
        return false;
    }
}
