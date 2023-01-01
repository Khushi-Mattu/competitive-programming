class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] str=s.split(" ");
        HashMap<Character,String> map=new HashMap<Character,String>();
        if(str.length!=pattern.length()){
            return false;
        }
        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            boolean containsKey=map.containsKey(ch);
            if(map.containsValue(str[i]) && !containsKey) return false;
            if(containsKey && !map.get(ch).equals(str[i])) return false;
            else map.put(ch,str[i]);
        }
        return true;
    }
}
