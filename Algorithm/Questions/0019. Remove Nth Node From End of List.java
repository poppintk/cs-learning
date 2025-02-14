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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;
        
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode fast = dummy;
        
        while (n > 0) {
            fast = fast.next;
            n--;
        }
        
        ListNode cur = dummy;
        while(fast.next != null) {
            fast = fast.next;
            cur = cur.next;
        }
        
        cur.next = cur.next.next;
        return dummy.next;
    }
}