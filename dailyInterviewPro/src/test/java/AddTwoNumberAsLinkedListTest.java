import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AddTwoNumberAsLinkedListTest {
    @Test
    void testAddTwoNumber() {
        var node1 = new AddTwoNumberAsLinkedList.ListNode(2);
        node1.next = new AddTwoNumberAsLinkedList.ListNode(4);
        node1.next.next = new AddTwoNumberAsLinkedList.ListNode(3);

        var node2 = new AddTwoNumberAsLinkedList.ListNode(5);
        node2.next = new AddTwoNumberAsLinkedList.ListNode(6);
        node2.next.next = new AddTwoNumberAsLinkedList.ListNode(4);

        assertThat(AddTwoNumberAsLinkedList.addTwoNumber(node1, node2))
                .satisfies(result -> assertThat(result.value).isEqualTo(5))
                .satisfies(result -> assertThat(result.next.value).isEqualTo(6))
                .satisfies(result -> assertThat(result.next.next.value).isEqualTo(4));
    }
}
