//optimised approach


class Solution {
    public boolean isAnagram(String s, String t) {
        int[] count=new int[26];
        for(char ch:s.toCharArray()){
            count[ch-'a']++;
        }
        for(char ch:t.toCharArray()){
            count[ch-'a']--;
        }
        for(int i:count){
            if(i!=0){
                return false;
            }
        }
        return true;




        /*
        char[] ch=s.toCharArray();
        char[] ch2= t.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch2);
        s=new String(ch);
        t=new String(ch2);
        // System.out.println(s);
        // System.out.println(t);
        if(s.equals(t)){
            return true;
        }
        return false;
        */
    }
}
