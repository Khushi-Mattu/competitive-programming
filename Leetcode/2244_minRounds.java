class Solution {
    public int minimumRounds(int[] tasks) {
        Map<Integer, Integer> mp = new HashMap<>();


        // Traverse through array elements and
        // count frequencies
        int n=tasks.length;
        for (int i = 0; i < n; i++)
        {
            if (mp.containsKey(tasks[i]))
            {
                mp.put(tasks[i], mp.get(tasks[i]) + 1);
            }
            else
            {
                mp.put(tasks[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()){
            if(entry.getValue()<2){
                return -1;
            }
        }
        int ans=0;
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()){
            int cnt=0;
            if(entry.getValue()<3){
                cnt+=1;
            }
            else{
            cnt+=entry.getValue()/3;
            if(entry.getValue()%3==2 || entry.getValue()%3==1){
                cnt+=1;
            }
            
            }
            System.out.println(cnt);
            ans+=cnt;
        }

        return ans;

    }
}