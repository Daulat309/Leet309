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
        ListNode rabit = head;
        ListNode turtle = head;
        while(rabit!=null){
            if(rabit.next==null) return false;
            rabit = rabit.next.next;
            turtle = turtle.next;
            if(rabit==turtle) return true;
        }
        return false;
    }
}