import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BinaryStringTest {
    @Test
    void test() {
       assertThat(BinaryString.checkOnesSegment("1001")).isFalse();
       assertThat(BinaryString.checkOnesSegment("110")).isTrue();
       assertThat(BinaryString.checkOnesSegment("1")).isTrue();
       assertThat(BinaryString.checkOnesSegment("11")).isTrue();
       assertThat(BinaryString.checkOnesSegment("1000")).isTrue();
    }
}
