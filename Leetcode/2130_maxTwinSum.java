/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
    public int pairSum(ListNode head) {
        int maxSum =0;
        
        // Calculate the length of the linked list
        int length = 0;
        ListNode curr = head;
        while (curr != null) {
            curr = curr.next;
            length++;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        int mid = length / 2;
        
        // Move the 'fast' pointer to the middle of the linked list
        for (int i = 0; i < mid; i++) {
            fast = fast.next;
        }
        
        // Reverse the second half of the linked list
        ListNode prev = null;
        while (fast != null) {
            ListNode next = fast.next;
            fast.next = prev;
            prev = fast;
            fast = next;
        }
        
        // Traverse both halves of the linked list and calculate the twin sums
        fast = prev; // 'fast' now points to the reversed second half
        while (slow != null && fast != null) {
            int sum = slow.val + fast.val;
            maxSum = Math.max(maxSum, sum);
            slow = slow.next;
            fast = fast.next;
        }
        
        return maxSum;
    }
}


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 
class Solution {
    public int pairSum(ListNode head) {
        int max=0;
        ListNode temp=head;
        ListNode temp2=head;
        int cnt=0;
        ArrayList<Integer> lis=new ArrayList<Integer>();
        while(temp!=null){
            lis.add(temp.val);
            temp=temp.next;
        }
        for(int i=0;i<=lis.size()/2;i++){
            int sum=lis.get(i)+lis.get(lis.size()-i-1);
            if(sum>max){
                max=sum;
            }
        }

        return max;
    }
}