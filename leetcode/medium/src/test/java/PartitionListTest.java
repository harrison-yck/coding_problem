import datastructure.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PartitionListTest {
    @Test
    void partition() {
        PartitionList partitionList = new PartitionList();
        assertThat(partitionList.partition(ListNode.create(1, 4, 3, 2, 5, 2), 3)).isEqualTo(ListNode.create(1, 2, 2, 4, 3, 5));
        assertThat(partitionList.partition(ListNode.create(2, 1), 2)).isEqualTo(ListNode.create(1, 2));
    }
}
