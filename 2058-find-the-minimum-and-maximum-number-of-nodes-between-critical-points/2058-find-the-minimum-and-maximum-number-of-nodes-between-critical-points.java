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
        Queue<Integer> q = new PriorityQueue<>();
        int i = 1;
        while(next!=null){
            if((cur.val<prev.val&&cur.val<next.val)||(cur.val>prev.val&&cur.val>next.val)) q.offer(i);
            i++;
            prev = cur;
            cur = next;
            next = next.next;
        }

        if(q.size()==1) return a;

        int fs = q.poll();

        int p = fs;
        int mn = Integer.MAX_VALUE;
        while(!q.isEmpty()){
            int k = q.poll();
            if(k-p<mn) mn = k - p;
            if(q.isEmpty()) a[1] = k - fs;
            p = k;
        }

        a[0] = mn;
        return a;

    }
}