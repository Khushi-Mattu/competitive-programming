/*
Time Limit Exceeded 

class Solution {
    public int findMaximumXOR(int[] nums) {
        int max = 0;
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j < nums.length; j++){
                max = Math.max(max, nums[i] ^ nums[j]);
            }
        }
        return max;
    }
}
*/


//this is not my solution. 
//https://leetcode.com/problems/maximum-xor-of-two-numbers-in-an-array/discuss/1723118/Java-most-optimized-solution
class Solution {
     public class TrieNode{
        TrieNode[] children;
        TrieNode(){
            children = new TrieNode[2];
        }
    }
    
    public TrieNode root;
    public int findMaximumXOR(int[] nums) {
        root = new TrieNode();
        
       
        for(int num : nums){
            insert(num);
        }
        
    
        int max = Integer.MIN_VALUE;
        for(int num : nums){
            int temp = find(num);
            max = Math.max(temp, max);
        }
        return max;
    }
    
    public int find(int number){
        TrieNode current = root;
        int bitIdx = 31;
        int ans = 0;
        
        while(bitIdx >= 0){
            int mask = 1<<bitIdx;
            int currentBitValue = (mask&number) == 0? 0 : 1;
            int requiredBitValue = currentBitValue^1;
            
            TrieNode node = current;
    
            if(node.children[requiredBitValue] != null){
                ans += mask;
                current = node.children[requiredBitValue];
            }else{
               
                current = node.children[currentBitValue];
            }
            bitIdx--;
        }
        return ans;
    }
    
    public void insert(int number){
        TrieNode current = root;
        int bitIdx = 31;
        
        while(bitIdx >= 0){
            //find the bit
            int mask = 1<<bitIdx; 
            int bitValue = (mask&number) == 0? 0 : 1;
            
            TrieNode node = current.children[bitValue];
            if(node == null){
                node = new TrieNode();
                current.children[bitValue] = node;
            }
            current = node;
            bitIdx--;
        }
    }
}