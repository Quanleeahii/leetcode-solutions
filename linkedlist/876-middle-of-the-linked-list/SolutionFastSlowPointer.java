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
    public ListNode middleNode(ListNode head) {
        if(head == null) return head;
        ListNode slowCur = head;
        ListNode fastCur = head;
        while(fastCur != null && fastCur.next != null){
            slowCur = slowCur.next;
            fastCur = fastCur.next.next;
        }
        return slowCur;
    }
}