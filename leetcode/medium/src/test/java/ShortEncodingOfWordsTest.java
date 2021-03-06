import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ShortEncodingOfWordsTest {
    @Test
    void test() {
        assertThat(ShortEncodingOfWords.trieSolution(new String[]{"time", "me", "bell"})).isEqualTo(10);
        assertThat(ShortEncodingOfWords.removeSubstringSolution(new String[]{"time", "me", "bell"})).isEqualTo(10);

        assertThat(ShortEncodingOfWords.trieSolution(new String[]{"aabbcbb", "bb"})).isEqualTo(8);
        assertThat(ShortEncodingOfWords.removeSubstringSolution(new String[]{"aabbcbb", "bb"})).isEqualTo(8);
    }
}
