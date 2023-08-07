class Solution 
{ 
    //Function to search a given number in row-column sorted matrix.
	static boolean search(int matrix[][], int n, int m, int x) 
	{  
	    // code here 
	    for(int i=0;i<n;i++){
	        if(matrix[0][i]==x){
	            return true;
	        }
	        else if(matrix[0][i]>x){
	            continue;
	        }
	        else{
	            for(int j=0;j<m;j++){
	                if(matrix[i][j]==x){
	                    return true;
	                }
	            }
	        }
	    }
	    return false;
	} 
} 
