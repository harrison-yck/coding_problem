import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StoneGameVIITest {

    @Test
    void stoneGameVII() {
        assertThat(StoneGameVII.stoneGameVII(new int[]{5, 3, 1, 4, 2})).isEqualTo(6);
        assertThat(StoneGameVII.stoneGameVII(new int[]{7, 90, 5, 1, 100, 10, 10, 2})).isEqualTo(122);
    }
}
