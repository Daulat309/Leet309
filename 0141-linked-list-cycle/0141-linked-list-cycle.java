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
        ListNode turtle = head;
        ListNode rabbit = head;
        while(rabbit!=null&&rabbit.next!=null){
            turtle = turtle.next;
            rabbit = rabbit.next;
            rabbit = rabbit.next;
            if(rabbit==turtle) return true;
        }
        return false;
    }
}