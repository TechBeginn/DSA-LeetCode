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
    public ListNode midNode(ListNode head){
        ListNode slow= head;
        ListNode fast= head;
        while(fast != null && fast.next != null){
            slow= slow.next;
            fast= fast.next.next;
        }
        return slow;
    }
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        ListNode curr= midNode(head);
        ListNode prev= null;
        ListNode next;
        while(curr != null){
            next= curr.next;
            curr.next= prev;
            prev= curr;
            curr= next;
        }
        
        ListNode right= prev;
        ListNode left= head;

        boolean result= true;
        while( right != null && left!= null){
            if(right.val != left.val){
                result= false;
            }
            right = right.next;
            left= left.next;
        }
        curr= prev;
        prev= null;
        while(curr != null){
            next= curr.next;
            curr.next= prev;
            prev= curr;
            curr= next;
        }
        return result;
    }
}