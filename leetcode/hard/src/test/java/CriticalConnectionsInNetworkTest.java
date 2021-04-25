import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CriticalConnectionsInNetworkTest {
    @Test
    void test() {
        List<List<Integer>> input = List.of(List.of(0, 1), List.of(1, 2), List.of(2, 0), List.of(1, 3));
        List<List<Integer>> output = List.of(List.of(1, 3));

        CriticalConnectionsInNetwork criticalConnectionsInNetwork = new CriticalConnectionsInNetwork();
        assertThat(criticalConnectionsInNetwork.criticalConnections(4, input)).isEqualTo(output);
    }
}
