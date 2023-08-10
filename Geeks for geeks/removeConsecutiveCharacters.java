class Solution{
    public String removeConsecutiveCharacter(String S){
        String str="";
        str+=S.charAt(0);
        for(int i=1;i<S.length();i++){
            if(S.charAt(i)==S.charAt(i-1)){
                continue;
            }
            str+=S.charAt(i);
        }
        return str;
    }
}