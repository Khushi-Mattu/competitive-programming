class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix=new int[n][n];
        int c=1;
        int top = 0, bottom = n - 1, left = 0, right = n - 1;
        while(top <= bottom && left <= right) {
            // Traverse right
            for(int i = left; i <= right; i++) {
               matrix[top][i]=c;
               c++;
            }
            top++;
            // Traverse down
            for(int i = top; i <= bottom; i++) {
                matrix[i][right]=c;
                c++;
            }
            right--;
            // Traverse left
            if(top <= bottom) {
                for(int i = right; i >= left; i--) {
                    matrix[bottom][i]=c;
                    c++;
                }
                bottom--;
            }
            // Traverse up
            if(left <= right) {
                for(int i = bottom; i >= top; i--) {
                    matrix[i][left]=c;
                    c++;
                }
                left++;
            }
        }
        return matrix;
    }
}
    

