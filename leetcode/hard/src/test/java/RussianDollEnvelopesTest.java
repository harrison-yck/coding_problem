import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RussianDollEnvelopesTest {
    @Test
    void maxEnvelopes() {
        assertThat(RussianDollEnvelopes.maxEnvelopes(new int[][]{{5, 4}, {6, 4}, {6, 7}, {2, 3}})).isEqualTo(3);
        assertThat(RussianDollEnvelopes.maxEnvelopes(new int[][]{{1, 1}, {1, 1}, {1, 1}})).isEqualTo(1);
        assertThat(RussianDollEnvelopes.maxEnvelopes(new int[][]{{1, 1}})).isEqualTo(1);
    }
}
