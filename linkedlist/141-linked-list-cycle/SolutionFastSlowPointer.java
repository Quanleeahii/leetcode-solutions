/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slowCur = head;
        ListNode fastCur = head;
        while(fastCur != null && fastCur.next != null){
            fastCur = fastCur.next.next;
            slowCur = slowCur.next;
            if(fastCur == slowCur) return true;
        }
        return false;
    }
}