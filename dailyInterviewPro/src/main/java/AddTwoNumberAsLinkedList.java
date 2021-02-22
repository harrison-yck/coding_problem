/*
    You are given two linked-lists representing two non-negative integers.
    The digits are stored in reverse order and each of their nodes contain a single digit.
    Add the two numbers and return it as a linked list.

    Example:
    Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
    Output: 7 -> 0 -> 8
    Explanation: 342 + 465 = 807.
 */

public class AddTwoNumberAsLinkedList {
    static ListNode addTwoNumber(ListNode node1, ListNode node2) {
        if (node1 == null && node2 == null) return new ListNode(0);

        boolean carryBit = false;
        ListNode head = null;
        ListNode rear = null;

        while (node1 != null || node2 != null) {
            ListNode currentSum = new ListNode(0);
            if (node1 != null) {
                currentSum.value += node1.value;
                node1 = node1.next;
            }

            if (node2 != null) {
                currentSum.value += node2.value;
                node2 = node2.next;
            }

            if (carryBit) currentSum.value++;

            if (currentSum.value > 9) {
                currentSum.value = currentSum.value % 10;
                carryBit = true;
            } else {
                carryBit = false;
            }

            if (head == null) {
                head = currentSum;
            } else {
                rear.next = currentSum;
            }

            rear = currentSum;
        }

        return head;
    }

    static class ListNode {
        int value;
        ListNode next = null;

        ListNode(int value) {
            this.value = value;
        }
    }
}
