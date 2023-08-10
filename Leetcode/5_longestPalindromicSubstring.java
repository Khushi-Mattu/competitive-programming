public class Solution {
private int lo, maxLen;

public String longestPalindrome(String s) {
	int len = s.length();
	if (len < 2)
		return s;
	
    for (int i = 0; i < len-1; i++) {
     	extendPalindrome(s, i, i);  //assume odd length, try to extend Palindrome as possible
     	extendPalindrome(s, i, i+1); //assume even length.
    }
    return s.substring(lo, lo + maxLen);
}

private void extendPalindrome(String s, int j, int k) {
	while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
		j--;
		k++;
	}
	if (maxLen < k - j - 1) {
		lo = j + 1;
		maxLen = k - j - 1;
	}
}}

/*class Solution {
  
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