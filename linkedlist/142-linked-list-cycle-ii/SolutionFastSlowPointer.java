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
    public ListNode detectCycle(ListNode head) {
        ListNode slowCur = head;
        ListNode fastCur = head;
        while(fastCur != null && fastCur.next != null){
            slowCur = slowCur.next;
            fastCur = fastCur.next.next;
            if(slowCur == fastCur){
                ListNode meet = fastCur;
                ListNode start = head;
                while(meet != start){
                    meet = meet.next;
                    start = start.next;
                }
                return meet;
            }
        }
        return null;
    }
}