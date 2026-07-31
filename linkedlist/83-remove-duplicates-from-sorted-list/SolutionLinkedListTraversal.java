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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        ListNode cur = head;
        ListNode prev = cur.next;
        while(cur != null && prev != null){
            if(prev.val == cur.val){
                prev = prev.next;
            }else{
                cur.next = prev;
                prev = prev.next;
                cur = cur.next;
            }
        }
        cur.next = null;
        return head;
    }
}