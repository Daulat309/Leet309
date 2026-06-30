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
        //Find middle

        ListNode sl = head;
        ListNode fs = head;
        while(fs!=null&&fs.next!=null){
            sl = sl.next;
            fs = fs.next.next;
        }

        //reverse second halve
        fs = sl.next;
        ListNode prev = null;
        sl.next = null;
        while(fs!=null){
            ListNode next = fs.next;
            fs.next = prev;
            prev = fs;
            fs = next;
        }

        //Mer Alternatively

        sl = head;
        fs = prev;
        while(fs!=null){
            ListNode first = sl.next;
            ListNode second = fs.next;

            sl.next = fs;
            fs.next = first;

            sl = first;
            fs = second;
        }
    }
}