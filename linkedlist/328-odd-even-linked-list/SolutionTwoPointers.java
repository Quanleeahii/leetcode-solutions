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
    public ListNode oddEvenList(ListNode head) {
        if(head == null) return head;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode oddTail = odd;
        ListNode evenTail = even;
        while(oddTail.next != null && evenTail.next != null){
            oddTail.next = oddTail.next.next;
            oddTail = oddTail.next;
            evenTail.next = evenTail.next.next;
            evenTail = evenTail.next;
        }
        oddTail.next = even;
        return head;
    }
}