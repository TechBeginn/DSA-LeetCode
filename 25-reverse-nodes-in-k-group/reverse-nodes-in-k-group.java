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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy= new ListNode(0, head);
        ListNode prevend= dummy;
        while(true){
            ListNode kth= prevend;
            for(int i=0; i<k && kth !=  null; i++){
                kth= kth.next;
            }
            if(kth == null){
                break;
            }
            ListNode nextgrp= kth.next;
            ListNode prev= nextgrp;
            ListNode curr= prevend.next;
            ListNode next= null;

            while(curr != nextgrp){
                next= curr.next;
                curr.next= prev;
                prev= curr;
                curr= next;
            }
            ListNode temp= prevend.next;
            prevend.next = kth;
            prevend= temp;
        }
        return dummy.next;
    }
}