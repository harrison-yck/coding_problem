import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SwimInRisingWaterTest {
    @Test
    void test() {
        SwimInRisingWater swimInRisingWater = new SwimInRisingWater();
        assertThat(swimInRisingWater.swimInWater(new int[][]{{0, 1, 2, 3, 4}, {24, 23, 22, 21, 5}, {12, 13, 14, 15, 16}, {11, 17, 18, 19, 20}, {10, 9, 8, 7, 6}})).isEqualTo(16);
    }
}
