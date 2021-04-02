import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RomanToIntTest {
    @Test
    void solve() {
        RomanToInt romanToInt = new RomanToInt();
        assertThat(romanToInt.solve("III")).isEqualTo(3);
        assertThat(romanToInt.solve("IV")).isEqualTo(4);
        assertThat(romanToInt.solve("IX")).isEqualTo(9);
        assertThat(romanToInt.solve("LVIII")).isEqualTo(58);
        assertThat(romanToInt.solve("MCMXCIV")).isEqualTo(1994);
    }
}
