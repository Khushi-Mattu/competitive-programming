class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        dfs(image, sr, sc, color, image[sr][sc]);
        return image;
    }
    public void dfs(int[][] grid, int row, int col, int color, int prevColor){
        if(row>=grid.length || col>=grid[0].length || row<0 || col <0 || grid[row][col] == color || grid[row][col]!=prevColor)
            return;
        grid[row][col] = color;
        dfs(grid, row+1, col, color, prevColor);
        dfs(grid, row, col+1, color, prevColor);
        dfs(grid, row-1, col, color, prevColor);
        dfs(grid, row, col-1, color, prevColor);
    }
}


