/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        //base case
        if(head == null) return null;

        Node curr= head;

        //1. create the copy of the node
        while(curr!= null){
            Node copy= new Node(curr.val);
            copy.next= curr.next;
            curr.next= copy;
            curr= copy.next;
        }
        
        //2. Create random pointers;
        curr= head;
        while(curr != null){
            if(curr.random != null){
                //copy.random= original.random.next
                curr.next.random= curr.random.next;
            }
            curr= curr.next.next;
        }

        //3. Separate the Lists Original and copied list
        curr= head;
        Node copyHead= head.next;

        while(curr != null){
            Node copy= curr.next;
            curr.next= copy.next;
            if(copy.next != null){
                copy.next= copy.next.next;
            }
            curr= curr.next;
        }
        return copyHead;
    }
}