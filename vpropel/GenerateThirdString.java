/*
Generate Third String
In an alphabet series with three strings of same length, the third string is formed from the characters of the second string. The absolute difference of the corressponding characters in position ‘i’ of S1 and S2 is added with characters of S2 to form S3.

 

Given two strings S1 and S2 of equal length, write a C++ code to generate S3 such that S1, S2 and S3 are in alphabet series. For example, strings HEJ, JGL and LIN are in alphabet series. If end of the alphabet is reached during processing then continue from the beginning of the alphabet. That is if S1 is AYB and S2 is BZC then S3 will be CAD.

Input Format

First line contains string S1

Next line contains string S2

Output Format

Print the string S3
*/



import java.util.*;
import java.lang.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        String str3="";
        char[] str1=s1.toCharArray();
        int[] st1=new int[s1.length()];
        int[] st2=new int[s2.length()];
        char[] st3=new char[s2.length()];
        char[] str2=s2.toCharArray();
        int[] diff=new int[s1.length()];
        for(int i=0;i<str1.length;i++)
        {
            st1[i] = (int) str1[i];
            //AYSystem.out.println(st1[i]);            
            st2[i] = (int) str2[i];
            //System.out.println(st2[i]);
            diff[i]=Math.abs(st1[i]-st2[i]);
            //System.out.println(diff[i]);
            int num=st2[i]+diff[i];
            if(num>90)
            {
            	num=(num-90)+64;
            }
            //System.out.println(num);
            st3[i]=(char) (num);
            str3+=st3[i];
        }
        
        System.out.println(str3);
        
        //System.out.println("Hello");
        sc.close();
    }
}
