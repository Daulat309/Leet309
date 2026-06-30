class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode cur = head;

        while (cur != null) {

            // Skip all nodes with the same value
            while (cur.next != null && cur.val == cur.next.val) {
                cur = cur.next;
            }

            // If prev.next != cur, duplicates existed
            if (prev.next != cur) {
                prev.next = cur.next;
            } else {
                prev = prev.next;
            }

            cur = cur.next;
        }

        return dummy.next;
    }
}