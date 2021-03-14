package datastructure;

/**
 * @author harrison
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {}

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode create(int... numbers) {
        ListNode head = new ListNode(numbers[0]);

        ListNode current = head;
        for (int i = 1; i < numbers.length; i++) {
            current.next = new ListNode(numbers[i]);
            current = current.next;
        }
        return head;
    }
}
