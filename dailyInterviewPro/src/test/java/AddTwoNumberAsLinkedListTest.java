import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author harrison
 */

public class AddTwoNumberAsLinkedListTest {
    @Test
    void test1() {
        var node1 = new AddTwoNumberAsLinkedList.ListNode(2);
        node1.next = new AddTwoNumberAsLinkedList.ListNode(4);
        node1.next.next = new AddTwoNumberAsLinkedList.ListNode(3);

        var node2 = new AddTwoNumberAsLinkedList.ListNode(5);
        node2.next = new AddTwoNumberAsLinkedList.ListNode(6);
        node2.next.next = new AddTwoNumberAsLinkedList.ListNode(4);

        assertThat(AddTwoNumberAsLinkedList.addTwoNumber(node1, node2))
                .satisfies(result -> assertThat(result.value).isEqualTo(7))
                .satisfies(result -> assertThat(result.next.value).isEqualTo(0))
                .satisfies(result -> assertThat(result.next.next.value).isEqualTo(8));
    }

    @Test
    void test2() {
        var node1 = new AddTwoNumberAsLinkedList.ListNode(1);
        node1.next = new AddTwoNumberAsLinkedList.ListNode(2);

        var node2 = new AddTwoNumberAsLinkedList.ListNode(1);
        node2.next = new AddTwoNumberAsLinkedList.ListNode(0);
        node2.next.next = new AddTwoNumberAsLinkedList.ListNode(1);

        assertThat(AddTwoNumberAsLinkedList.addTwoNumber(node1, node2))
                .satisfies(result -> assertThat(result.value).isEqualTo(2))
                .satisfies(result -> assertThat(result.next.value).isEqualTo(2))
                .satisfies(result -> assertThat(result.next.next.value).isEqualTo(1));
    }

    @Test
    void test3() {
        assertThat(AddTwoNumberAsLinkedList.addTwoNumber(null, null))
                .satisfies(result -> assertThat(result.value).isEqualTo(0));
    }
}
