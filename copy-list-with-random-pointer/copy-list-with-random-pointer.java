/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;
​
    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/
class Solution {
    public Node copyRandomList(Node head) {
        if(head == null) return null;
        
        Map<Node, Node> map = new HashMap<>();
        Node curr = head;
        
        //Fill the map with Nodes and their copy
        while(curr != null){
            map.put(curr, new Node(curr.val));
            curr = curr.next;
        }
        
        //Use the map to find the .next and .random in O(1) time and set them
        curr = head;
        while(curr != null){
            map.get(curr).next = map.get(curr.next);
            map.get(curr).random = map.get(curr.random);
            curr = curr.next;
        }
        
        return map.get(head);
        
        
    }
}
