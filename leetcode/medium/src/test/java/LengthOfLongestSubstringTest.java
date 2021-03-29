import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LengthOfLongestSubstringTest {

    @Test
    void solve() {
        assertThat(LengthOfLongestSubstring.solve("abrkaabcdefghijjxxx")).isEqualTo(10);
        assertThat(LengthOfLongestSubstring.solve("abcabcbb")).isEqualTo(3);
        assertThat(LengthOfLongestSubstring.solve("bbbbb")).isEqualTo(1);
        assertThat(LengthOfLongestSubstring.solve("pwwkew")).isEqualTo(3);
        assertThat(LengthOfLongestSubstring.solve("")).isEqualTo(0);
        assertThat(LengthOfLongestSubstring.solve(" ")).isEqualTo(1);
        assertThat(LengthOfLongestSubstring.solve("dvdf")).isEqualTo(3);
    }
}
