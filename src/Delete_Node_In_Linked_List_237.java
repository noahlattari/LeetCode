public class Delete_Node_In_Linked_List_237 {
    class Solution {
        public void deleteNode(ListNode node) {
            node.next = node.next.next;
            node.val = node.next.val;
        }
    }
}
