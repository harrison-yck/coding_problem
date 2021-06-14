import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MaximumUnitsOnATruckTest {

    @Test
    void maximumUnits() {
        assertThat(MaximumUnitsOnATruck.maximumUnits(new int[][] {{1, 3}, {2, 2}, {3, 1}}, 4)).isEqualTo(8);
        assertThat(MaximumUnitsOnATruck.maximumUnits(new int[][] {{5, 10}, {2, 5}, {4, 7}, {3, 9}}, 10)).isEqualTo(91);
    }
}
