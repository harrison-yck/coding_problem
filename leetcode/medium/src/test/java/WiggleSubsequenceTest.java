import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class WiggleSubsequenceTest {

    @Test
    void wiggleMaxLength() {
        assertThat(WiggleSubsequence.wiggleMaxLength(new int[]{1,7,4,9,2,5})).isEqualTo(6);
        assertThat(WiggleSubsequence.wiggleMaxLength(new int[]{1,17,5,10,13,15,10,5,16,8})).isEqualTo(7);
        assertThat(WiggleSubsequence.wiggleMaxLength(new int[]{1,2,3,4,5,6,7,8,9})).isEqualTo(2);
        assertThat(WiggleSubsequence.wiggleMaxLength(new int[]{0, 0})).isEqualTo(1);
        assertThat(WiggleSubsequence.wiggleMaxLength(new int[]{0, 0, 0})).isEqualTo(1);
        assertThat(WiggleSubsequence.wiggleMaxLength(new int[]{3, 3, 3, 2, 5})).isEqualTo(3);

        assertThat(WiggleSubsequence.cleanWiggleMaxLength(new int[]{1,7,4,9,2,5})).isEqualTo(6);
        assertThat(WiggleSubsequence.cleanWiggleMaxLength(new int[]{1,17,5,10,13,15,10,5,16,8})).isEqualTo(7);
        assertThat(WiggleSubsequence.cleanWiggleMaxLength(new int[]{1,2,3,4,5,6,7,8,9})).isEqualTo(2);
        assertThat(WiggleSubsequence.cleanWiggleMaxLength(new int[]{0, 0})).isEqualTo(1);
        assertThat(WiggleSubsequence.cleanWiggleMaxLength(new int[]{0, 0, 0})).isEqualTo(1);
        assertThat(WiggleSubsequence.cleanWiggleMaxLength(new int[]{3, 3, 3, 2, 5})).isEqualTo(3);
    }
}
