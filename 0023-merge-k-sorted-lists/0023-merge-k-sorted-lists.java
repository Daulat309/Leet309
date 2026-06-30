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
    public ListNode mergeKLists(ListNode[] lists) {
        Queue<ListNode> min = new PriorityQueue<>(
            (a,b) -> {
                return a.val - b.val;
            }
        );

        int i = 0;
        while(i<lists.length){
        ListNode list = lists[i];
        ListNode sl = list;
        ListNode fs = list;
        while(list!=null){
            min.offer(new ListNode(list.val));
            list = list.next;
        }
        i++;
        }
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while(!min.isEmpty()){
        cur.next = min.poll();
        cur = cur.next;
        }

        return dummy.next;
    }   
}