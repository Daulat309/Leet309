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
        if(lists.length==0) return null;
        int diff = 1;
        while(diff<lists.length){
            for(int i = 0;i+diff<lists.length;i += diff*2){
                lists[i] = merge(lists[i],lists[i+diff]);
            }
            diff *= 2;
        }
        return lists[0];
    }

    public ListNode merge(ListNode list1, ListNode list2) {
        ListNode cur = new ListNode(0);
        ListNode head = cur;
        while(list1!=null&&list2!=null){
            if(list1.val>list2.val){
                cur.next = list2;
                list2 = list2.next;
            }
            else {
                cur.next = list1;
                list1 = list1.next;
            }
            cur = cur.next;
        }
        cur.next = (list1 != null) ? list1 : list2;
        return head.next;
    }
}