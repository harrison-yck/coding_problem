import datastructure.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class SwappingNodesInLinkedListTest {
    @Test
    void swapNodes() {
        assertThat(SwappingNodesInLinkedList.swapNodes(ListNode.create(1, 2, 3, 4, 5), 2))
                .usingRecursiveComparison().isEqualTo(ListNode.create(1, 4, 3, 2, 5));

        assertThat(SwappingNodesInLinkedList.swapNodes(ListNode.create(7, 9, 6, 6, 7, 8, 3, 0, 9, 5), 5))
                .usingRecursiveComparison().isEqualTo(ListNode.create(7, 9, 6, 6, 8, 7, 3, 0, 9, 5));

        assertThat(SwappingNodesInLinkedList.swapNodes(ListNode.create(1), 1))
                .usingRecursiveComparison().isEqualTo(ListNode.create(1));

        assertThat(SwappingNodesInLinkedList.swapNodes(ListNode.create(1, 2, 3), 2))
                .usingRecursiveComparison().isEqualTo(ListNode.create(1, 2, 3));

        assertThat(SwappingNodesInLinkedList.swapNodes(ListNode.create(1, 2), 1))
                .usingRecursiveComparison().isEqualTo(ListNode.create(2, 1));

        assertThat(SwappingNodesInLinkedList.swapNodes(ListNode.create(100, 90), 2))
                .usingRecursiveComparison().isEqualTo(ListNode.create(90, 100));

        assertThat(SwappingNodesInLinkedList.swapNodes(ListNode.create(80, 46, 66, 35, 64), 1))
                .usingRecursiveComparison().isEqualTo(ListNode.create(64, 46, 66, 35, 80));

        assertThat(SwappingNodesInLinkedList.swapNodes(ListNode.create(100,24,24,36,18,52,95,61,54,88,86,79,11,1,31,26), 16))
                .usingRecursiveComparison().isEqualTo(ListNode.create(26,24,24,36,18,52,95,61,54,88,86,79,11,1,31,100));
    }

    @Test
    void swapNodeValues() {
        assertThat(SwappingNodesInLinkedList.swapNodeValues(ListNode.create(1, 2, 3, 4, 5), 2))
                .usingRecursiveComparison().isEqualTo(ListNode.create(1, 4, 3, 2, 5));

        assertThat(SwappingNodesInLinkedList.swapNodeValues(ListNode.create(7, 9, 6, 6, 7, 8, 3, 0, 9, 5), 5))
                .usingRecursiveComparison().isEqualTo(ListNode.create(7, 9, 6, 6, 8, 7, 3, 0, 9, 5));

        assertThat(SwappingNodesInLinkedList.swapNodeValues(ListNode.create(1), 1))
                .usingRecursiveComparison().isEqualTo(ListNode.create(1));

        assertThat(SwappingNodesInLinkedList.swapNodeValues(ListNode.create(1, 2, 3), 2))
                .usingRecursiveComparison().isEqualTo(ListNode.create(1, 2, 3));

        assertThat(SwappingNodesInLinkedList.swapNodeValues(ListNode.create(1, 2), 1))
                .usingRecursiveComparison().isEqualTo(ListNode.create(2, 1));

        assertThat(SwappingNodesInLinkedList.swapNodeValues(ListNode.create(100, 90), 2))
                .usingRecursiveComparison().isEqualTo(ListNode.create(90, 100));

        assertThat(SwappingNodesInLinkedList.swapNodeValues(ListNode.create(80, 46, 66, 35, 64), 1))
                .usingRecursiveComparison().isEqualTo(ListNode.create(64, 46, 66, 35, 80));

        assertThat(SwappingNodesInLinkedList.swapNodeValues(ListNode.create(100,24,24,36,18,52,95,61,54,88,86,79,11,1,31,26), 16))
                .usingRecursiveComparison().isEqualTo(ListNode.create(26,24,24,36,18,52,95,61,54,88,86,79,11,1,31,100));
    }
}
