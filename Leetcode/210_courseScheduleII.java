class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int n=prerequisites.length;
        
        ArrayList< ArrayList<Integer>> arr=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            arr.add(new ArrayList<>());
        }

        for(int i=0;i<n;i++){
            arr.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }

        int[] in =new int[numCourses];
        for(int i=0;i<numCourses;i++){
            for(int it:arr.get(i)){
                in[it]++;
            }
        }

        Queue<Integer> q =new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(in[i]==0){
                q.add(i);
            }
        }

        ArrayList<Integer> visited=new ArrayList<Integer> ();
        while(!q.isEmpty()){
            int node=q.poll();
            visited.add(node);
            for(int i:arr.get(node)){
                in[i]--;
                if(in[i]==0) q.add(i);
            }
        }

        int[] ans=new int[visited.size()];
        for(int i=visited.size()-1;i>=0;i--){
            ans[ans.length-i-1]=visited.get(i);
        }
        if(visited.size()!=numCourses) return new int[0];
        return ans;
    }
}