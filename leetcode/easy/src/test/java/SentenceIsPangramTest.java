import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SentenceIsPangramTest {
    @Test
    void test() {
        SentenceIsPangram sentenceIsPangram = new SentenceIsPangram();
        assertThat(sentenceIsPangram.checkIfPangram("thequickbrownfoxjumpsoverthelazydog")).isTrue();
        assertThat(sentenceIsPangram.checkIfPangram("leetcode")).isFalse();
    }
}
