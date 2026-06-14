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
    public ListNode removeNthFromEnd(ListNode head, int cnt) {
        ListNode dum = new ListNode(0);
        ListNode fs = dum;
        ListNode sl = dum;
        dum.next = head;

        while(cnt>=0){
            cnt--;
            fs = fs.next;
        }
        while(fs!=null){
            fs = fs.next;
            sl = sl.next;
        }
        sl.next = sl.next.next;
        return dum.next;
    }
}