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
        int n = 0;
        cur = head;
        ListNode fs = head;
        while(cur!=null){
            n++;
            cur = cur.next;
        }
        cur = head;
        n = n/2;
        while(n-->0){
            fs = fs.next;
        }
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