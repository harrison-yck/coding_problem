import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class findLongestWordTest {
    @Test
    void test() {
        assertThat(FindLongestWord.solution("abpcplea", Lists.newArrayList("ale", "apple", "monkey", "plea"))).isEqualTo("apple");
        assertThat(FindLongestWord.solution("bab", Lists.newArrayList("ba","ab","a","b"))).isEqualTo("ab");
        assertThat(FindLongestWord.solution("aewfafwafjlwajflwajflwafj", Lists.newArrayList("apple","ewaf","awefawfwaf","awef","awefe","ewafeffewafewf"))).isEqualTo("ewaf");
        assertThat(FindLongestWord.solution("apple", Lists.newArrayList("zxc", "vbn"))).isEqualTo("");
    }
}
