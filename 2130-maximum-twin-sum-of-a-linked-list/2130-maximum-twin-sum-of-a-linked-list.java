class Solution {
    public int pairSum(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode reverse = slow;
        ListNode dumm = null;

        while (reverse != null) {
            ListNode temp = reverse.next;
            reverse.next = dumm;
            dumm = reverse;
            reverse = temp;
        }

        reverse = dumm;   // <-- missing tha

        int ans = Integer.MIN_VALUE;

        while (reverse != null) {
            ans = Math.max(ans, reverse.val + head.val);

            reverse = reverse.next;
            head = head.next;
        }

        return ans;
    }
}