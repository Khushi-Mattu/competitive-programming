class Solution {
    public boolean isAnagram(String s, String t) {
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
    }
}