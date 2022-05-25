import java.util.*;
class Solution {
    public String reverseWords(String s) {
        String[] str=s.split(" ");
        String as="";
        for(int i=0;i<str.length;i++){
            char[] arr=str[i].toCharArray();
            int len=arr.length;
            int start=0;
            int end=len-1;
            char[] ans=new char[len];
            while(start<len && end>=0 ){
                ans[start]=arr[end];
            //System.out.println(ans[start]);
            //System.out.println(s[end]);
                start++;
                end--;
            }
            for(int j=0;j<ans.length;j++)
            {
                as+=ans[j];
            }
            as+=" ";
        }
        String result=as.trim();
        return result;
    }
}

/*
class Solution {
    public String reverseWords(String s) {
        String ans="";
        String arr[]=s.split(" ");
        for(int i=0;i<arr.length;i++){
            StringBuilder st=new StringBuilder(arr[i]);
            ans=ans+st.reverse().toString()+" ";
        }
        return ans.substring(0,ans.length()-1);
    }
}
*/
