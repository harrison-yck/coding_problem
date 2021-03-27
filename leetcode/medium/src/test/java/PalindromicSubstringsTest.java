import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PalindromicSubstringsTest {

    @Test
    void countSubstrings() {
        assertThat(PalindromicSubstrings.countSubstrings("abc")).isEqualTo(3);
        assertThat(PalindromicSubstrings.countSubstrings("aaa")).isEqualTo(6);
        assertThat(PalindromicSubstrings.countSubstrings("aba")).isEqualTo(4);
    }
}
