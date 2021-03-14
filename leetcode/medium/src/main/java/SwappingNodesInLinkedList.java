import datastructure.ListNode;

/**
 * @author harrison
 */
public class SwappingNodesInLinkedList {
    public static ListNode swapNodes(ListNode head, int k) {
        ListNode dummyNode = new ListNode(0, head), preLeft = new ListNode(0, head), preRight = new ListNode(0, head);
        ListNode left = head, right = head;

        int size = 1;
        ListNode node = head;
        for (int index = 1; node.next != null; node = node.next, index++) {
            if (index < k) {
                preLeft = left;
                left = left.next;
            }

            size++;
        }

        for (int i = 1; i <= size - k; i ++) {
            preRight = right;
            right = right.next;
        }

        if (left == right) return head;
        else if (size < 4) {
            if (k == 2) {
                left.next = right;
                right.next = null;
                return left;
            } else {
                right.next = left;
                left.next = null;
                return right;
            }
        } else {
            preLeft.next = right;
            preRight.next = left;

            ListNode tmp = left.next;
            left.next = right.next;
            right.next = tmp;

            if (k == 1) dummyNode.next = right;
            else if (k == size) dummyNode.next = left;
        }

        return dummyNode.next;
    }

    public static ListNode swapNodeValues(ListNode head, int k) {
        ListNode fast = head, slow = head;

        for (int i = 1; i < k; i++) fast = fast.next;
        ListNode right = fast;

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        int tmp = right.val;
        right.val = slow.val;
        slow.val = tmp;

        return head;
    }
}
