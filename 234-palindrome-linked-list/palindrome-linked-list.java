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
    public boolean isPalindrome(ListNode head){
        ListNode slow= head;
        ListNode fast= head;
        ListNode temp= head;
        while(fast != null && fast.next != null){
            fast= fast.next.next;
            slow= slow.next;
        }
    
        ListNode prev=null;
        ListNode curr= slow;

        while(curr != null){
           ListNode next = curr.next; // store next;
           curr.next = prev;          // reverse link
           prev = curr;               // move prev
           curr = next;          
        }

        ListNode curr2= head;
        ListNode p= prev;
        
        while(p != null){
            if(p.val != curr2.val){
                return false;
            }
            p = p.next;
            curr2 = curr2.next;
        }

        return true;
    }
}