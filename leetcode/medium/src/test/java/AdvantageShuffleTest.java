import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class AdvantageShuffleTest {
    @Test
    void treeAdvantageCount() {
        assertThat(AdvantageShuffle.treeAdvantageCount(new int[]{2, 7, 11, 15}, new int[]{1, 10, 4, 11})).isEqualTo(new int[] {2,11,7,15});
        assertThat(AdvantageShuffle.treeAdvantageCount(new int[]{12, 24, 8, 32}, new int[]{13, 25, 32, 11})).isEqualTo(new int[] {24, 32, 8, 12});

        assertThat(AdvantageShuffle.advantageCount(new int[]{2, 7, 11, 15}, new int[]{1, 10, 4, 11})).isEqualTo(new int[] {2,11,7,15});
        assertThat(AdvantageShuffle.advantageCount(new int[]{12, 24, 8, 32}, new int[]{13, 25, 32, 11})).isEqualTo(new int[] {24, 32, 8, 12});
    }
}
