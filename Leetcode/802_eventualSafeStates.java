class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        boolean visited[]=new boolean[graph.length];
        boolean dp[]=new boolean[graph.length];
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<graph.length;i++){
            if(visited[i]){
                if(dp[i])
                    ans.add(i);
            }
            else if(recur(i,graph,visited,dp))
                ans.add(i);
        }
        return ans;
    }
    public boolean recur(int i, int graph[][], boolean visited[], boolean dp[]){
        if(visited[i]) return dp[i];
        visited[i]=true;
        boolean check=true;
        for(int p:graph[i])
            check=check&recur(p,graph,visited,dp);
        return dp[i]=check;
    }
}