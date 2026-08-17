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
    public ListNode swapPairs(ListNode head) {
        int cnt = 0;
        ListNode dm = new ListNode();
        dm.next = head;
        ListNode temp = head;
        ListNode prev = dm;
        while(temp!=null){
            cnt++;
            temp = temp.next;
        }
        int r = cnt/2;
        temp = head;

        for(int i = 0;i<r;i++){
            ListNode next = temp.next;
            temp.next = next.next;
            next.next = temp;
            prev.next = next;
            prev = temp;
            temp = temp.next;
        }
        return dm.next;
    }
}