class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        ListNode curr = head;
        int n = 1;

        while (curr.next != null) {
            curr = curr.next;
            n++;
        }

        //circular
        curr.next = head;

        k = k % n;

        int steps = n - k;

        ListNode newTail = curr;

        while (steps-- > 0) {
            newTail = newTail.next;
        }

        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }
}