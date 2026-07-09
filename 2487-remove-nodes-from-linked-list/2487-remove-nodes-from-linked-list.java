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
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> st = new Stack<>();
        ListNode cur = head;
        while(cur!=null){
            // if(!st.isEmpty()){
                while(!st.isEmpty()&&cur.val>st.peek().val){
                    st.pop();
                }
            // }
            st.push(cur);
            cur = cur.next;
        }
        ListNode dum = new ListNode(0);
        cur = dum;
        while(!st.isEmpty()){
            cur.next = st.pop();
            cur = cur.next;
        }
        cur.next = null;
        head = dum.next;
        ListNode prev = null;
        while(head!=null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}