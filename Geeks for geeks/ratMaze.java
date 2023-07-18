import java.util.*;
import java.io.*;
public class mazeGFG{

    public static boolean solveMaze(int maze[][],int n)
    {
        int sol[][] = new int[n][n];
        if (solve(maze, 0, 0,n, sol) == false) {
            System.out.print("Solution doesn't exist");
            return false;
        }
        System.out.print("Solution exists");
        return true;
    }

    public static boolean solve(int[][] matrix, int x,int y,int n,int[][] sol){
        if(x==n-1 && y==n-1 && matrix[x][y]==1){
            return true;
        }
        
        if(safe(matrix,x,y,n)){

            if(sol[x][y]==1){
                return false;
            }
            sol[x][y]=1;

            if(solve(matrix,x+1,y,n,sol)){
                return true;
            }
            if(solve(matrix,x,y+1,n,sol)){
                return true;
            }
            sol[x][y]=0;
            return false;
        }
        return false;
    }

    public static boolean safe(int[][] maze,int i,int j,int n){
        if(maze[i][j]==1 && i>0 && j>0 && i<n && j<n){
            return true;
        }
        return false;
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] maze=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                maze[i][j]=sc.nextInt();
            }
        }

        solveMaze(maze,n);
    }

    
}