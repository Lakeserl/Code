class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode trav = dummy;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            trav.next = new ListNode(sum % 10);
            trav = trav.next;
            carry = sum / 10;
        }

        if (carry > 0) {
            trav.next = new ListNode(carry);
        }

        return dummy.next;
    }
}