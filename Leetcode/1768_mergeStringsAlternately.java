class Solution {
    public String mergeAlternately(String str1, String str2) {
        int i=0;String res="";
        while(i<str1.length() && i<str2.length()){
            res+=str1.charAt(i);
            res+=str2.charAt(i);
            i++;
        }
        if(i<str1.length()){
            res+=str1.substring(i,str1.length());
        }
        if(i<str2.length()){
            res+=str2.substring(i,str2.length());
        }
        return res;
    }
}