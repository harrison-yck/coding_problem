import datastructure.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedListIITest {
    @Test
    void reverseBetween() {
        ReverseLinkedListII reverseLinkedListII = new ReverseLinkedListII();
        assertThat(reverseLinkedListII.reverseBetween(ListNode.create(1, 2, 3, 4, 5), 1, 3)).usingRecursiveComparison().isEqualTo(ListNode.create(1, 4, 3, 2, 5));
    }
}
