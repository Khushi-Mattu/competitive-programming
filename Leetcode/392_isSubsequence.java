//100% faster solution 

class Solution {
    public boolean isSubsequence(String s, String t) {
        int n=s.length();
        int m= t.length();
        if(n>m){
            return false;
        }
        int prev=0;
        for(int i=0;i<n;i++){
            int a = t.indexOf(s.charAt(i),prev);
            if(a<0){
                return false;
            }
            prev=a+1;
        }
        return true;
    }
}



/*
class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0 || s==null) return true;
        if(t.length()==0 || t==null) return false;
        
        int i=0; //keep track of current index at t
        int j=0; //keep track of current index at s
        while(i!=t.length()){
            if(s.charAt(j)==t.charAt(i)) j++; //if  s element == t element then look 
                                              //for next s character
            i++; // check next character in string t
            if(j==s.length()) return true; //if we reached the end of string s then there is
                                           //a subsequence
        }
        return false; //otherwise return false
    }
}