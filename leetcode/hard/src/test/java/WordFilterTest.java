import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class WordFilterTest {
    @Test
    void test() {
        WordFilter wordFilter = new WordFilter(new String[]{"cabaabaaaa","ccbcababac","bacaabccba","bcbbcbacaa","abcaccbcaa","accabaccaa","cabcbbbcca","ababccabcb","caccbbcbab","bccbacbcba"});
        assertThat(wordFilter.f("bccbacbcba", "a")).isEqualTo(9);
        assertThat(wordFilter.f("ab", "abcaccbcaa")).isEqualTo(4);
        assertThat(wordFilter.f("a", "aa")).isEqualTo(5);
        assertThat(wordFilter.f("cabaaba", "abaaaa")).isEqualTo(0);
        assertThat(wordFilter.f("cacc", "accbbcbab")).isEqualTo(8);
        assertThat(wordFilter.f("ccbcab", "bac")).isEqualTo(1);
        assertThat(wordFilter.f("bac", "cba")).isEqualTo(2);
        assertThat(wordFilter.f("ac", "accabaccaa")).isEqualTo(5);
        assertThat(wordFilter.f("bcbb", "aa")).isEqualTo(3);
        assertThat(wordFilter.f("ccbca", "cbcababac")).isEqualTo(1);
    }
}
