class Solution {
    public void solveSudoku(char[][] board) {
        solve(board,0,0);
    }
    public boolean solve(char[][] board,int row,int col){
        if(row==board.length){
            return true;
        }
        if(col==board[0].length){
            return solve(board,row+1,0);
        }
        if(board[row][col]!='.'){
            return solve(board,row,col+1);
        }

        for(char num='1';num<='9';num++){
            if(isValid(board,row,col,num)){
                board[row][col]=num;
                if(solve(board,row,col+1)){
                    return true;
                }
                 // Backtrack to previous state if solution not found
                board[row][col]='.';
                
            }
        }
        return false;
    }

    public boolean isValid(char[][] board,int row,int col,int num){
        for(int i=0;i<board.length;i++){
            if(board[i][col]==num){
                return false;
            }
            if(board[row][i]==num){
                return false;
            }
            int subRow=3*(row/3)+(i/3);
            int subCol=3*(col/3)+(i%3);

            if(board[subRow][subCol]==num){
                return false;
            }
        }
        return true;

        
    }
}