class Solution {
    public int findKthLargest(int[] nums, int k) {
         PriorityQueue<Integer> pq=new PriorityQueue<>();
         int t=k;
         int i=0;
         while(t-->0){
             pq.add(nums[i++]);
         }

         int Kmax=0;
         for(i=k;i<nums.length;i++){
             Kmax=pq.peek();
             if(Kmax<nums[i]){
                 pq.poll();
                 pq.add(nums[i]);
             }
         }
         return pq.peek(); 
    }
}