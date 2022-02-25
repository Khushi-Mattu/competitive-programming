import java.util.Scanner;

public class Solution {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        char temp = 0;
        String c=a.toUpperCase();
        String d=b.toUpperCase();
        char[] cha=c.toCharArray();        
        char[] chb=d.toCharArray();
        
        for(int i=0; i < cha.length; i++) {
         for(int j=0; j < cha.length; j++) {
            if(cha[j] > cha[i]) {
               temp = cha[i];
               cha[i] = cha[j];
               cha[j] = temp;
            }
         }
      }
      for(int i=0; i < chb.length; i++) {
         for(int j=0; j < chb.length; j++) {
            if(chb[j] > chb[i]) {
               temp = chb[i];
               chb[i] = chb[j];
               chb[j] = temp;
            }
         }
      }
      int count=0;
      if(cha.length==chb.length){
      for(int i=0;i<cha.length;i++){
          if(cha[i]==chb[i]){
              count++;
          }
      }
      if(count==cha.length){
          return true;
      }
      else{
          return false;
      }
      }
      else{
          return false;
      }
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}