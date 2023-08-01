/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    if(list1!=null && list2!=null){
        if(list1.val<list2.val){
            list1.next=mergeTwoLists(list1.next,list2);
            return list1;
        }
        else{
            list2.next=mergeTwoLists(list1,list2.next);
            return list2;
        }
    }
    if(list1==null){
        return list2;
    }
    return list1;
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
public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode firstNode = null;
        ListNode lastNode = null;
        if(list1==null || list2==null)
            firstNode = list1 == null?list2:list1;
        else {
            // Fetch first element and shift forward the relevant list
            boolean isOneBigger = list1.val > list2.val;
            firstNode = isOneBigger?list2:list1;
            lastNode = firstNode;
            list1 = isOneBigger?list1:list1.next;
            list2 = isOneBigger?list2.next:list2;
            
            // Add the rest of the nodes
            while(list1 != null && list2 != null) {
                isOneBigger = list1.val > list2.val;
                lastNode.next = isOneBigger?list2:list1;
                lastNode = lastNode.next;
                list1 = isOneBigger?list1:list1.next;
                list2 = isOneBigger?list2.next:list2;
            }

            lastNode.next = list1 == null?list2:list1;
        }
        return firstNode;
    }
}
