import java.lang.*;
class Solution {
    public int percentageLetter(String s, char letter) {
        char[] letters=s.toCharArray();
        double count=0.0;
        for(int i=0;i<letters.length;i++){
            if(letters[i]==letter)
            {
                count++;
            }
        }
        //System.out.println(count);
        double size=letters.length;
        //System.out.println(letters.length);
        double num=(count/size)*100;
       // System.out.println(num);
        int ans=(int) Math.floor(num);
        return ans;
    }
}