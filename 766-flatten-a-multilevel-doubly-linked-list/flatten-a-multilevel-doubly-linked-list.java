/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        //base case whether the head.next != null if there then just print head;
        //intialize the current
        // check the curr till not null
        // chech till the child is not null
        // store the next, next= curr.next and the child also store
        // interation of the child
        //connect tail to child, that child.next= next and next.prev= child
        // connect curr to child, curr.next to child, child prev to curr, curr child= null;
        // curr next
        
        if(head == null) return head;
        Node curr= head;

        while(curr != null){
            if(curr.child != null){
                Node next= curr.next;
                Node child= curr.child;
                
                while(child.next != null){
                    child= child.next;
                }

                child.next= next;
                if(next != null) next.prev= child;

                curr.next= curr.child;
                curr.child.prev= curr;
                curr.child= null;
            }
            curr= curr.next;
        }
        return head;
    }
}