//my solution

class Solution {
    public void check(int[][] isConnected,int j){
        for(int i=0;i<isConnected[0].length;i++){
            if(isConnected[j][i]==1){
                isConnected[j][i]=0;
                check(isConnected,i);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int num=0;
        for(int i=0;i<isConnected.length;i++){
            for(int j=0;j<isConnected[i].length;j++){
                if(isConnected[i][j]==1){
                    num++;
                   check(isConnected,j);
                }
            }
        }
        return num;
    }
}

//efficient solution

class Solution {
    public int findCircleNum(int[][] grid) {
        boolean[] visited = new boolean[grid.length];
        int c=0;
        for(int i=0;i<grid.length;i++) {
            if(!visited[i]) {
                dfs(i,grid,visited);
                c++;
            }
        }
        return c;
    }

    private void dfs(int j,int[][] grid,boolean[] visited) {
        visited[j]=true;
        for(int i=0;i<grid[j].length;i++) {
            if(!visited[i] && grid[j][i]==1) {
                dfs(i,grid,visited);
            }
        }
    }
    
}