class Solution {
    	public int equalPairs(int[][] grid) {
        int n = grid.length;
        int count = 0;
        int trans[][] = new int[n][n];
        transpose(grid, trans);
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
				//compare each row of original matrix with its transpose
                if(Arrays.equals(grid[i], trans[j]))
                    count++;
            }
        }
        return count;
    }
    
    private void transpose(int A[][], int B[][]){
        int n = A.length;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                B[i][j] = A[j][i];
    }
}