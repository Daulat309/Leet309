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
    public ListNode rotateRight(ListNode head, int k) {
        int size = 0;
        ListNode temp = head;
        while(temp!=null){
            temp = temp.next;
            size++;
        }
        if(size==0) return head;
        k = k % size;
        
        //System.out.println(size);
        ArrayList<Integer> list = new ArrayList<>();
        int f = size - k;
        temp = head;
        int n = 0;
        while(temp!=null){
            n++;
            if(n>f) list.add(temp.val);
            temp = temp.next;
        }
        for(int i = list.size()-1;i>=0;i--){
            ListNode node = new ListNode(list.get(i));
            node.next = head;
            head = node;
        }
        temp = head;
        n = 1;
        while(n!=size){
            size--;
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }
}