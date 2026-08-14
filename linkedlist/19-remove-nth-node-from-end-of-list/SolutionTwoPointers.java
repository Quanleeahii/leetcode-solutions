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
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curSlow = dummy;
        ListNode curFast = dummy;
        for(int i = 0; i < n; i++) curFast = curFast.next;
        while(curFast.next != null){
            curFast = curFast.next;
            curSlow = curSlow.next;
        }
        curSlow.next = curSlow.next.next;
        return dummy.next;
    }
}