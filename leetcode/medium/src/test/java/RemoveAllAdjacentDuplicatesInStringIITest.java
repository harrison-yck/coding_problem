import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RemoveAllAdjacentDuplicatesInStringIITest {
    @Test
    void test() {
        RemoveAllAdjacentDuplicatesInStringII removeAllAdjacentDuplicatesInStringII = new RemoveAllAdjacentDuplicatesInStringII();
        assertThat(removeAllAdjacentDuplicatesInStringII.removeDuplicates("abcd", 2)).isEqualTo("abcd");
        assertThat(removeAllAdjacentDuplicatesInStringII.removeDuplicates("deeedbbcccbdaa", 3)).isEqualTo("aa");
        assertThat(removeAllAdjacentDuplicatesInStringII.removeDuplicates("pbbcggttciiippooaais", 2)).isEqualTo("ps");
        assertThat(removeAllAdjacentDuplicatesInStringII.removeDuplicates("yfttttfbbbbnnnnffbgffffgbbbbgssssgthyyyy", 4)).isEqualTo("ybth");
    }
}
