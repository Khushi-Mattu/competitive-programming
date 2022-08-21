//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String input_line[] = read.readLine().trim().split("\\s+");
            int n1 = Integer.parseInt(input_line[0]);
            int n2 = Integer.parseInt(input_line[1]);
            int n3 = Integer.parseInt(input_line[2]);
            input_line = read.readLine().trim().split("\\s+");
            String A = input_line[0];
            String B = input_line[1];
            String C = input_line[2];
            Solution obj = new Solution();
            System.out.println(obj.LCSof3(A, B, C, n1, n2, n3));
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    int LCSof3(String A, String B, String C, int n1, int n2, int n3) 
    { 
       Integer[][][] dp = new Integer[100][100][100];
        
        return fun(A,B,C,n1-1,n2-1,n3-1,dp);
        
    }
    
    int fun(String s1,String s2,String s3,int i,int j,int k,Integer[][][] dp)
    {
        if(i<0||j<0||k<0)
        {
            return 0;
        }
        
        if(dp[i][j][k]!=null)
        {
           return dp[i][j][k];
        }
        

        if(s1.charAt(i)==s2.charAt(j) && s3.charAt(k)==s2.charAt(j) && s3.charAt(k)==s1.charAt(i))
        {
          dp[i][j][k] = 1 + fun(s1,s2,s3,i-1,j-1,k-1,dp);
        }
        else
        {
           dp[i][j][k] = Math.max(fun(s1,s2,s3,i-1,j,k,dp), Math.max(fun(s1,s2,s3,i,j-1,k,dp) ,fun(s1,s2,s3,i,j,k-1,dp)));       
        }
     
        return dp[i][j][k];
    }
} 