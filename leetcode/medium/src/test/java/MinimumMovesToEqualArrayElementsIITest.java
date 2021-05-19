import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MinimumMovesToEqualArrayElementsIITest {
    @Test
    void test() {
        MinimumMovesToEqualArrayElementsII minimumMovesToEqualArrayElementsII = new MinimumMovesToEqualArrayElementsII();
        assertThat(minimumMovesToEqualArrayElementsII.minMoves2(new int[]{1})).isEqualTo(0);
        assertThat(minimumMovesToEqualArrayElementsII.minMoves2(new int[]{1, 2})).isEqualTo(1);
        assertThat(minimumMovesToEqualArrayElementsII.minMoves2(new int[]{1, 2, 3})).isEqualTo(2);
        assertThat(minimumMovesToEqualArrayElementsII.minMoves2(new int[]{1, 1, 1})).isEqualTo(0);
        assertThat(minimumMovesToEqualArrayElementsII.minMoves2(new int[]{1, 10, 2, 9})).isEqualTo(16);
    }
}
