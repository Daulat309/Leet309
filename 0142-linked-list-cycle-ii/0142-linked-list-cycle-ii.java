/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode sl = head;
        ListNode fs = head;

        while(fs!=null&&fs.next!=null){
            sl = sl.next;
            fs = fs.next.next;
            if(sl==fs){
            sl = head;
            while(sl!=fs){
                sl = sl.next;
                fs = fs.next;
            }
            return sl;
            }
        }
        return null;
    }
}



// Meeting point for slow pointer is L1 + L2 for fast it is L1 + L2 + nC
// 2 ( L1 + L2 ) = L1 + L2 + nC
// L1 + L2 = nC  //n==1
// L1 = C - L2
// After meeting slow need to reach starting point is L2 - C which is L1
// After meeting slow start from initial and fast start from same point they will meet at starting point