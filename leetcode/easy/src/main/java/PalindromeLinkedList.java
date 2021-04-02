import datastructure.ListNode;

/**
 * @author harrison
 */
public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        // To achieve O(1) space, need to reverse half of the list and compare with another half
        ListNode fast = head, leftHalfReversedHead = null;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;

            // swap
            ListNode next = head.next; // serve as tmp
            head.next = leftHalfReversedHead;
            leftHalfReversedHead = head;
            head = next;
        }

        if (fast != null) head = head.next; // odd list, middle value don't have to compare

        // compare
        while (leftHalfReversedHead != null && head != null) {
            if (leftHalfReversedHead.val != head.val) return false;
            leftHalfReversedHead = leftHalfReversedHead.next;
            head = head.next;
        }

        return true;
    }
}
