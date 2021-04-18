import datastructure.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RemoveNthNodeFromEndOfListTest {

    @Test
    void removeNthFromEnd() {
        RemoveNthNodeFromEndOfList removeNthNodeFromEndOfList = new RemoveNthNodeFromEndOfList();
        assertThat(removeNthNodeFromEndOfList.removeNthFromEnd(ListNode.create(1, 2, 3, 4, 5), 2)).isEqualTo(ListNode.create(1, 2, 3, 5));
    }
}
