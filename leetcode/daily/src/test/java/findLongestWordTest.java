import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class findLongestWordTest {
    @Test
    void test() {
        assertThat(FindLongestWord.solve("abpcplea", Lists.newArrayList("ale", "apple", "monkey", "plea"))).isEqualTo("apple");
        assertThat(FindLongestWord.solve("bab", Lists.newArrayList("ba","ab","a","b"))).isEqualTo("ab");
        assertThat(FindLongestWord.solve("aewfafwafjlwajflwajflwafj", Lists.newArrayList("apple","ewaf","awefawfwaf","awef","awefe","ewafeffewafewf"))).isEqualTo("ewaf");
        assertThat(FindLongestWord.solve("apple", Lists.newArrayList("zxc", "vbn"))).isEqualTo("");
    }
}
