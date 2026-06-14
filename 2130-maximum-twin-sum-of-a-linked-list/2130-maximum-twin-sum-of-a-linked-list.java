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
    public int pairSum(ListNode head) {
        int n = 0;
        ListNode cur = head;
        while(cur!=null){
            cur = cur.next;
            n++;
        }
        int[] a = new int[n+1];
        int i = 0, mx = 0;
        cur = head;
        while(cur!=null){
            a[i] = cur.val;
            mx = Math.max(mx,a[i]+a[n-1-i]);
            cur = cur.next;
            i++;
        }
        return mx;
    }
}