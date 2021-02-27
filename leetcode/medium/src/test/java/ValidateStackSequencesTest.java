import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ValidateStackSequencesTest {
    @Test
    void solve() {
        assertThat(ValidateStackSequences.solve(new int[]{1,2,3,4,5}, new int[]{4,5,3,2,1})).isTrue();
        assertThat(ValidateStackSequences.solve(new int[]{1,2,3,4,5}, new int[]{4,3,5,1,2})).isFalse();
        assertThat(ValidateStackSequences.solve(new int[]{2,1,0}, new int[]{1,2,0})).isTrue();
    }
}
