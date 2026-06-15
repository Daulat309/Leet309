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
    public ListNode deleteMiddle(ListNode head) {
        // int n = 0;
        // while(fs!=null){
        //     n++;
        //     fs = fs.next;
        // }
        ListNode dum = new ListNode(0);
        dum.next = head;
        ListNode fs = dum;
        ListNode sl = dum;
        while(fs.next!=null&&fs.next.next!=null){
            sl = sl.next;
            fs = fs.next.next;
        }
        sl.next = sl.next.next;
        return dum.next;
    }
}