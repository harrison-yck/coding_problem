import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class VerifyingAlienDictionaryTest {

    @Test
    void isAlienSorted() {
        VerifyingAlienDictionary verifyingAlienDictionary = new VerifyingAlienDictionary();
        assertThat(verifyingAlienDictionary.isAlienSorted(new String[]{"hello", "leetcode"}, "hlabcdefgijkmnopqrstuvwxyz")).isTrue();
        assertThat(verifyingAlienDictionary.isAlienSorted(new String[]{"word", "world", "row"}, "worldabcefghijkmnpqstuvxyz")).isFalse();
        assertThat(verifyingAlienDictionary.isAlienSorted(new String[]{"apple", "app"}, "abcdefghijklmnopqrstuvwxyz")).isFalse();
        assertThat(verifyingAlienDictionary.isAlienSorted(new String[]{"kuvp","q"}, "ngxlkthsjuoqcpavbfdermiywz")).isTrue();
        assertThat(verifyingAlienDictionary.isAlienSorted(new String[]{"apap", "app"}, "abcdefghijklmnopqrstuvwxyz")).isTrue();
    }
}
