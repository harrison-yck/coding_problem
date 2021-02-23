import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RomanToIntTest {
    @Test
    void solve() {
        assertThat(RomanToInt.solve("III")).isEqualTo(3);
        assertThat(RomanToInt.solve("IV")).isEqualTo(4);
        assertThat(RomanToInt.solve("IX")).isEqualTo(9);
        assertThat(RomanToInt.solve("LVIII")).isEqualTo(58);
        assertThat(RomanToInt.solve("MCMXCIV")).isEqualTo(1994);
    }
}
