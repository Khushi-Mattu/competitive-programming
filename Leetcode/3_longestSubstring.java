class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans=0;
        int n=s.length();
        Map<Character, Integer> mp=new HashMap<>();
        for(int j=0,i=0;j<n;j++){
            if(mp.containsKey(s.charAt(j)))
            {
                i=Math.max(i,mp.get(s.charAt(j)));
            }
            ans=Math.max(ans,j-i+1);
            mp.put(s.charAt(j),j+1);
            
        }
        return ans;
    }
}