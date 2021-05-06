import datastructure.ListNode;
import datastructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author harrison
 */
public class ConvertSortedListToBST {
//    public TreeNode sortedListToBST(ListNode head) {
//        if (head == null) return null;
//
//        List<Integer> list = new ArrayList<>();
//        while (head != null) {
//            list.add(head.val);
//            head = head.next;
//        }
//
//        return construct(list, 0, list.size() - 1);
//    }
//
//    private TreeNode construct(List<Integer> list, int start, int end) {
//        if (start > end) return null;
//
//        int mid = start + (end - start) / 2;
//        TreeNode root = new TreeNode(list.get(mid));
//        root.left = construct(list, start, mid - 1);
//        root.right = construct(list, mid + 1, end);
//        return root;
//    }

    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return new TreeNode(head.val);

        ListNode pre = head, fast = head, slow = head;

        while (fast != null && fast.next != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        pre.next = null; // trick here

        TreeNode node = new TreeNode(slow.val);
        node.left = sortedListToBST(head);
        node.right = sortedListToBST(slow.next);
        return node;
    }
}
