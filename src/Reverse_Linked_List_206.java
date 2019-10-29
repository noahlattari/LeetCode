class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

public class Reverse_Linked_List_206 {

    public static void main(String[] args) {

    }

    public ListNode reverseList(ListNode head) {

        if(head.next == null){ //Corner case, if empty list or 1 element.
            return head;
        }


        ListNode prev = null; //Need to remember the previous since we are switching the arrow direction, starts at null because nothing prev yet
        ListNode curr = head; //What we iterate with, we coulda just used head
        ListNode next = null; //Need to remember the next node since we are switching the arrow direction.


        while(curr != null){
            next = curr.next; //Make next the "real" next.
            curr.next = prev; //Make the current's next value = to the previous (flipping the arrow)
            prev = curr; //Set the previous to the current since we need it next time
            curr = next; //Iterate through the linked list.
        }

        head = prev; //idk

        return head;
    }
}
