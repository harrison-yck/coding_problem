import datastructure.ListNode;

/**
 * @author harrison
 */
public class ReverseLinkedListII {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        // base
        if (left == 0) return reverse(head, right);
        // recursive
        head.next = reverseBetween(head.next, left - 1, right - 1);

        return head;
    }

    ListNode successor = null;
    private ListNode reverse(ListNode head, int index) {
        if (index == 0) {
            successor = head.next;
            return head;
        }

        ListNode last = reverse(head.next, index - 1);
        head.next.next = head;
        head.next = successor;
        return last;
    }
}
