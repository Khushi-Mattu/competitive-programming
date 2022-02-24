import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        char[] ch=A.toCharArray();
        char[] reverse= new char[ch.length];
        int count=0;
        for(int j=ch.length-1;j>=0;j--){
            reverse[ch.length-1-j]=ch[j];
        }
        /* Enter your code here. Print output to STDOUT. */
        for(int i=0;i<ch.length;i++){
            //System.out.print(ch[i]);
            //System.out.print(reverse[i]);
            if(ch[i]==reverse[i]){
                
                count++;
            }
        }
        if(count==ch.length){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        sc.close();
    }
}



