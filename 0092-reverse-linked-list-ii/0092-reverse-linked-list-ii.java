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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode temp = head;
        
        ListNode dm = new ListNode();
        ListNode prev = dm;
        dm.next = head;
        prev.next = head;

        for(int i = 1;i<left;i++){
            prev = prev.next;
            temp = temp.next;
        }

        for(int l = left;l<right;l++){
            ListNode next = temp.next;
            temp.next = next.next;
            next.next = prev.next;
            prev.next = next;
        }
        return dm.next;
    }
}