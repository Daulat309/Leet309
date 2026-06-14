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
        ListNode prev = head;
        ListNode cur = head;
        int cnt = 0;
        while(cur!=null){
            cnt++;
            cur = cur.next;
        }
        cur = head;
        if(cnt==n){
            head = head.next;
            return head;
        }
        cnt = cnt - n;
        while(cnt!=0){
            cnt--;
            prev = cur;
            cur = cur.next;
        }
        prev.next = cur.next;
        return head;
    }
}