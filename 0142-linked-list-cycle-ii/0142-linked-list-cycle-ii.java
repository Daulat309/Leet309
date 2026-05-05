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
        ListNode rabit = head;
        ListNode turtle = head;
        while(rabit!=null&&rabit.next!=null){
            rabit = rabit.next.next;
            turtle = turtle.next;
            if(rabit==turtle) break;
        }
        if(rabit==null||rabit.next==null) return null;
        while(head!=turtle){
            head = head.next;
            turtle = turtle.next;
        }
        return head;
    }
}