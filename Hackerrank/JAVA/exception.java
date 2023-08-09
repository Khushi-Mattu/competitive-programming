import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        try{
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int c=x/y;
        System.out.println(c);
    }
    catch(InputMismatchException e)
    {
        e= new InputMismatchException();
        System.out.println(e);
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
    }
}
