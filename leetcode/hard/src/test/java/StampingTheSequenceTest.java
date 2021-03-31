import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StampingTheSequenceTest {
    @Test
    void test() {
        var stampingTheSequence = new StampingTheSequence();
        assertThat(stampingTheSequence.movesToStamp("abc", "ababc")).isEqualTo(new int[]{0, 2});
        assertThat(stampingTheSequence.movesToStamp("abca", "aabcaca")).isIn(new int[]{0, 3, 1}, new int[]{3, 0, 1});
        assertThat(stampingTheSequence.movesToStamp("aye", "eyeye")).isEqualTo(new int[]{});
        assertThat(stampingTheSequence.movesToStamp("h", "hhhhh")).isEqualTo(new int[]{4, 3, 2, 1, 0});
        assertThat(stampingTheSequence.movesToStamp("mda", "mdadddaaaa")).isEqualTo(new int[]{});
    }
}
