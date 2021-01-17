/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
      
        ListNode dummy = head;
        int count = 0;
        while(dummy.next != null){
            dummy = dummy.next;
            count++;
        }
       
        
        int position = count - n;
        dummy = head;
         if(position==-1) {
            return head.next;
        }
        for(int i = 0; i < position; i++){
            dummy = dummy.next;
        }
        if(dummy.next != null){
            dummy.next = dummy.next.next;
        }
        
        return head;
    }
}
