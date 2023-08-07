
class Solution {
    String printString(String S, char ch, int count) {
        // code here
        int i=0;
        if(count==0){
            return S;
        }
        while(count>=0 && i<S.length() ){
            if(i==S.length() && count==0){
                return " ";
            }
            if(count==0){
                return S.substring(i);
            }
            
            if(S.charAt(i)==ch){
                count--;
                
            }
            i++;
        }
        return "Empty string";
    }
}