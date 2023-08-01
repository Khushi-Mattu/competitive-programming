class Solution {
    public boolean isValidSudoku(char[][] board) {

        int[] res;

        for(int i = 0;i < 9;i++){

            res = new int[9];

            for(int j = 0;j < 9;j++){
                if(board[i][j] == '.'){
                    continue;
                }

                res[board[i][j]-'1']++;

                if(res[board[i][j]-'1'] > 1){
                    return false;
                }
            }
        }

        for(int i = 0;i < 9;i++){

            res = new int[9];

            for(int j = 0;j < 9;j++){
                if(board[j][i] == '.'){
                    continue;
                }

                res[board[j][i]-'1']++;

                if(res[board[j][i]-'1'] > 1){
                    return false;
                }
            }
        }
        
        for(int i = 0;i < 3;i++){
            for(int j = 0;j < 3;j++){
                res = new int[9];
                for(int p = 3*i;p < 3*i+3;p++){
                    for(int q = 3*j;q < 3*j+3;q++){
                        if(board[p][q] == '.'){
                            continue;
                        }

                        res[board[p][q]-'1']++;

                        if(res[board[p][q]-'1'] > 1){
                            return false;
                        }

                    }
                }
            }
        }

        return true;
    }
}