import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ThreeSumTest {
    @Test
    void threeSum() {
        ThreeSum threeSum = new ThreeSum();
        assertThat(threeSum.threeSum(new int[]{-1, 0, 1, 2, -1, -4})).containsAll(List.of(List.of(-1, -1, 2), List.of(-1, 0, 1)));
    }
}