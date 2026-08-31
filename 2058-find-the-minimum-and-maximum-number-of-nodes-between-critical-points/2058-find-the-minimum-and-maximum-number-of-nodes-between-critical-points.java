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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] a = new int[2];
        Arrays.fill(a,-1);
        if(head==null||head.next==null||head.next.next==null) return a;
        ListNode prev = head;
        ListNode cur = head.next;
        ListNode next = head.next.next;
        int i = 1;
        int p = -1;
        int fs = -1;
        int mn = Integer.MAX_VALUE;
        while(next!=null){
            if((cur.val<prev.val&&cur.val<next.val)||(cur.val>prev.val&&cur.val>next.val)){
                if(fs==-1){
                    fs = i;
                }
                else{
                    if(i-p<mn) mn = i - p;
                }

                p = i;
            }
            i++;
            prev = cur;
            cur = next;
            next = next.next;
            if(next==null&&fs!=p) a[1] = p - fs;
        }

        if(fs!=-1&&fs!=p)a[0] = mn;
        return a;

    }
}