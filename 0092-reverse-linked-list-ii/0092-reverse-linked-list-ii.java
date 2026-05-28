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
    public ListNode reverseBetween(ListNode head, int l, int r) {
        if(head==null||l==r) return head;
        ListNode dm = new ListNode();
        dm.next = head;
        ListNode cur = head;
        ListNode prev = dm;
        for(int i = 1;i<l;i++) prev = prev.next;
        cur = prev.next;
        ListNode fs = prev;
        ListNode ls = cur;

        for(int i = 0;i<=r-l;i++){
            ListNode d = cur.next;
            cur.next = prev;
            prev = cur;
            cur = d;
        }
        fs.next = prev;
        ls.next = cur;
        if(l==1) head = prev;
        return head;
    }
}