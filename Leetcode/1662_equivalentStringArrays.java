class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        if(word1.length == 0 || word2.length == 0) return false;
        return String.join("", word1).equals(String.join("", word2));
    }
}
/*
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1="";
        String str2="";
        boolean flag=false;
        for(int i=0;i<word1.length;i++){
            str1+=word1[i];
        }
            System.out.println(str1);
        for(int i=0;i<word2.length;i++){
            str2+=word2[i];
        }
         System.out.println(str2);
        if(str1.equals(str2)){
            flag=true;
        }
        return flag;
    }
}