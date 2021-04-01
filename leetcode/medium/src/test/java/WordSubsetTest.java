import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class WordSubsetTest {
    @Test
    void wordSubsets() {
        assertThat(WordSubset.wordSubsets(new String[]{"amazon","apple","facebook","google","leetcode"}, new String[]{"e","o"})).isEqualTo(List.of("facebook","google","leetcode"));
        assertThat(WordSubset.wordSubsets(new String[]{"amazon","apple","facebook","google","leetcode"}, new String[]{"l","e"})).isEqualTo(List.of("apple","google","leetcode"));
        assertThat(WordSubset.wordSubsets(new String[]{"amazon","apple","facebook","google","leetcode"}, new String[]{"e","oo"})).isEqualTo(List.of("facebook","google"));
        assertThat(WordSubset.wordSubsets(new String[]{"amazon","apple","facebook","google","leetcode"}, new String[]{"lo","eo"})).isEqualTo(List.of("google","leetcode"));
        assertThat(WordSubset.wordSubsets(new String[]{"amazon","apple","facebook","google","leetcode"}, new String[]{"ec","oc", "ceo"})).isEqualTo(List.of("facebook","leetcode"));
    }
}
