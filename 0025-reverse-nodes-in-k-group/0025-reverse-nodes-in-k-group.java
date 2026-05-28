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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k==1) return head;
        ListNode temp = head;
        int cnt = 0;
        while(temp!=null){
            cnt++;
            temp = temp.next;
        }
        int r = cnt/k;
        ListNode dm = new ListNode();
        dm.next = head;
        ListNode prev = dm;
        for(int i = 0;i<r;i++){
            // prev = dm;
            //for(int j = 0;j<i*k;j++) prev = prev.next;
            ListNode cur = prev.next;
            for(int p = 0;p<k-1;p++){
                ListNode next = cur.next;
                cur.next = next.next;
                next.next = prev.next;
                prev.next = next;
            }
            prev = cur;
        }
        return dm.next;
    }
}