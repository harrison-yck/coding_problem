import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StampingTheSequenceTest {
    @Test
    void test() {
        assertThat(StampingTheSequence.movesToStamp("abc", "ababc")).isEqualTo(new int[]{0, 2});
    }
}
