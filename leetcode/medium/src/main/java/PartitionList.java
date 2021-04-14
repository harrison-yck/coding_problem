import datastructure.ListNode;

/**
 * @author harrison
 */
public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        ListNode smallerHead = new ListNode(0), largerHead = new ListNode(0);
        ListNode smaller = smallerHead, larger = largerHead;

        while (head != null) {
            if (head.val < x) {
                smaller.next = head;
                smaller = smaller.next;
            } else {
                larger.next = head;
                larger = larger.next;
            }
            head = head.next;
        }

        smaller.next = largerHead.next;
        larger.next = null;
        return smallerHead.next;
    }
}
