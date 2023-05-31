class Solution {
    public int maxOperations(int[] nums, int k) {
        int num=0;
        int i=0;
        int j=nums.length-1;
        Arrays.sort(nums);
        while(i<j){
            if(nums[i]+nums[j]==k){
                num++;
                i++;
                j--;
            }
            else if(nums[i]+nums[j]<k){
                i++;
            }
            else{
            j--;
            }
        }
        return num;
    }
}

/*
//HashMap Solution
        Map<Integer,Integer>map=new HashMap<>();
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(k-nums[i]) && map.get(k-nums[i])>0){
                ans++;
                map.put(k-nums[i],map.get(k-nums[i])-1);
            }
            else{
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
        }
        return ans;