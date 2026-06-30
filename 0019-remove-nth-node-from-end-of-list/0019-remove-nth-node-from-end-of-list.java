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
        ListNode dummy = new ListNode(0);
        ListNode sl = dummy;
        ListNode fs = dummy;
        dummy.next = head;
        for(int i = 0;i<=n;i++){
            fs = fs.next;
        }
        while(fs!=null){
            sl = sl.next;
            fs = fs.next;
        }
        sl.next = sl.next.next;
        return dummy.next;
    }
}