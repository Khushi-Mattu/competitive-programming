
class Solution {
  
    public String longestPalindrome(String s) {
      String ans="";
      int max=0;
      char[] ch=s.toCharArray();
      for(int i=0;i<ch.length;i++){
        //odd length
        int left=i;
        int right=i;
        while(left>=0 && right<ch.length && ch[left]==ch[right]){
          if((right-left+1)>max){
            ans=s.substring(left,right+1);
            max=right-left+1;
          }
          left--;
          right++;
        }
        //even length
        left=i;
        right=i+1;
        while(left>=0 && right<ch.length && ch[left]==ch[right]){
          if((right-left+1)>max){
            ans=s.substring(left,right+1);
            max=right-left+1;
          }
          left--;
          right++;
        }
      }
      return ans;
    }
}