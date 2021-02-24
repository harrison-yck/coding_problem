import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BrokenCalculatorTest {
    @Test
    void solve() {
        assertThat(BrokenCalculator.solve(2, 3)).isEqualTo(2);
        assertThat(BrokenCalculator.solve(5, 8)).isEqualTo(2);
        assertThat(BrokenCalculator.solve(3, 10)).isEqualTo(3);
        assertThat(BrokenCalculator.solve(1024, 1)).isEqualTo(1023);
        assertThat(BrokenCalculator.solve(1, 10000000)).isEqualTo(34);
    }
}
