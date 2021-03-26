import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class WordSubSetTest {
    @Test
    void wordSubsets() {
        assertThat(WordSubSet.wordSubsets(new String[]{"amazon","apple","facebook","google","leetcode"}, new String[]{"e","o"})).isEqualTo(List.of("facebook","google","leetcode"));
        assertThat(WordSubSet.wordSubsets(new String[]{"amazon","apple","facebook","google","leetcode"}, new String[]{"l","e"})).isEqualTo(List.of("apple","google","leetcode"));
        assertThat(WordSubSet.wordSubsets(new String[]{"amazon","apple","facebook","google","leetcode"}, new String[]{"e","oo"})).isEqualTo(List.of("facebook","google"));
        assertThat(WordSubSet.wordSubsets(new String[]{"amazon","apple","facebook","google","leetcode"}, new String[]{"lo","eo"})).isEqualTo(List.of("google","leetcode"));
        assertThat(WordSubSet.wordSubsets(new String[]{"amazon","apple","facebook","google","leetcode"}, new String[]{"ec","oc", "ceo"})).isEqualTo(List.of("facebook","leetcode"));
    }
}
