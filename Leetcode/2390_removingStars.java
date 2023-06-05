class Solution {
    public String removeStars(String s) {
        StringBuilder c = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') {
                c.deleteCharAt(c.length() - 1);
            } else {
                c.append(s.charAt(i));
            }
        }
        return c.toString();
    }
}


/*
class Solution {
    public String removeStars(String s) {
        Stack<Character> letters=new Stack<Character>();
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))){
                letters.push(s.charAt(i));
            }
            else{
                letters.pop();
            }
        }

        String res="";
        for(char c:letters){
            res+=c;
        }
        //String reverse = new StringBuilder(res).reverse().toString();
        return res;
    }
   
}