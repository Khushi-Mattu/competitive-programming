class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String str="";
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))){
                str+=s.charAt(i);
            }
        }
        s=str;
        
        
        String rev=new StringBuilder(s).reverse().toString();
        System.out.print(s+" "+rev);
        if(rev.equals(s)){
            return true;
        }

        return false;
    }
}