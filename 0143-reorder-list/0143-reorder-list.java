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
    public void reorderList(ListNode head) {
        ListNode fs = head;
        ListNode sl = head;
        while(fs!=null&&fs.next!=null){
            fs = fs.next.next;
            sl = sl.next;
        }

        ListNode prev = null;
        fs = sl.next;
        sl.next = null;
        while(fs!=null){
            ListNode next = fs.next;
            fs.next = prev;
            prev = fs;
            fs = next;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;
        fs = head;
        while(prev!=null&&fs!=null){
            cur.next = fs;
            cur = cur.next;
            fs = fs.next;
            cur.next = prev;
            cur = cur.next;
            prev = prev.next;
        }
        cur.next = fs==null? prev : fs;
        head = dummy.next;
    }
}