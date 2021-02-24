import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class findLongestWordThroughDeletingTest {
    @Test
    void test() {
        assertThat(FindLongestWordThroughDeleting.solve("abpcplea", Lists.newArrayList("ale", "apple", "monkey", "plea"))).isEqualTo("apple");
        assertThat(FindLongestWordThroughDeleting.solve("bab", Lists.newArrayList("ba","ab","a","b"))).isEqualTo("ab");
        assertThat(FindLongestWordThroughDeleting.solve("aewfafwafjlwajflwajflwafj", Lists.newArrayList("apple","ewaf","awefawfwaf","awef","awefe","ewafeffewafewf"))).isEqualTo("ewaf");
        assertThat(FindLongestWordThroughDeleting.solve("apple", Lists.newArrayList("zxc", "vbn"))).isEqualTo("");
    }
}
