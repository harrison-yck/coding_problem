import datastructure.ListNode;

/**
 * @author harrison
 */
public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // dummy node here is not a must,
        // however, using a dummy node can be helpful when there is corner case like only one node, a need to remove the head node
        ListNode newHead = new ListNode(0);
        newHead.next = head;

        ListNode fast = newHead;
        ListNode slow = newHead;

        for (int i = 1; i <= n + 1; i++) { // stop at n + 1
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next; // skip this node
        return newHead.next;
    }
}
