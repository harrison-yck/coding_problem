package datastructure;

import java.util.Objects;

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

    public static void print(ListNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        sb.append(node.val).append(" ");

        while(node.next != null) {
            node = node.next;
            sb.append(node.val).append(" ");
        }

        sb.append("]");

        System.out.println(sb);
    }

    public static void print(ListNode node, int n) {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        sb.append(node.val).append(" ");

        int count = 1;
        while(count < n) {
            node = node.next;
            sb.append(node.val).append(" ");
            count++;
        }

        sb.append("]");

        System.out.println(sb);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListNode listNode = (ListNode) o;
        return val == listNode.val && Objects.equals(next, listNode.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, next);
    }
}
