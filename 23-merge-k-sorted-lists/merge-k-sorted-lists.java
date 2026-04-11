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
class NodeCom implements Comparator<ListNode>{
        public int compare(ListNode a, ListNode b){
        return a.val - b.val;
    }
}
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>(new NodeCom());
        for(int i=0; i< lists.length; i++){
            if(lists[i] != null){
                pq.add(lists[i]);
            }
        }
        ListNode dummy= new ListNode(0);
        ListNode curr= dummy;
        
        while(! pq.isEmpty()){
            ListNode min= pq.poll();
            curr.next= min;
            curr= curr.next;
            if(min.next != null){
                pq.add(min.next);
            }
        }
        return dummy.next;
    }
}