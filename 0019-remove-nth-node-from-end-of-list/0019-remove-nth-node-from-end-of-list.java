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
        int cnt = 0;
        ListNode cur = head;
        while(cur!=null){
            cnt++;
            cur = cur.next;
        }
        cnt = cnt - n;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode front = head;
        ListNode back = dummy;
        while(cnt-->0){
            front = front.next;
            back = back.next;
        }
        back.next = front.next;
        return dummy.next;
    }
}