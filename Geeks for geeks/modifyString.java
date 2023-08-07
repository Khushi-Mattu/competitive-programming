class Solution{
    String modify(String s){
        if(Character.isLowerCase(s.charAt(0))){
        return s.toLowerCase();
            
        }
        return s.toUpperCase();
    }
}