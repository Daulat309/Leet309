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
    boolean is = true;
    ListNode cur = new ListNode();
    public boolean isPalindrome(ListNode head) {
        ListNode dum = new ListNode(0);
        dum.next= head;
        ListNode fs = dum;
        cur = dum;
        while(cur!=null&&cur.next!=null){
            fs = fs.next;
            cur = cur.next.next;
        }
        if(cur!=null) fs = fs.next;
        cur = head;
        check(fs);
        return is;
    }

    public void check(ListNode fs){
            if(cur==fs) return;
            if(fs==null) return;
            check(fs.next);
            System.out.println(fs.val+"  "+cur.val);
            if(cur.val!=fs.val){
                is = false;
                return;
            }
            cur = cur.next;
        }
}