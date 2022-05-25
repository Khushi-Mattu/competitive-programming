class Solution {
    public void reverseString(char[] s) {
        int len=s.length;
        int start=0;
        int end=len-1;
        char[] ans=new char[len];
        while(start<len && end>=0 ){
            ans[start]=s[end];
            //System.out.println(ans[start]);
            //System.out.println(s[end]);
            start++;
            end--;
        }
        for(int i=0;i<len;i++){
            s[i]=ans[i];
        }
        //return s;
    }
}