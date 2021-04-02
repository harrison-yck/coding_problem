import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BinaryStringTest {
    @Test
    void test() {
        var binaryString = new BinaryString();
       assertThat(binaryString.checkOnesSegment("1001")).isFalse();
       assertThat(binaryString.checkOnesSegment("110")).isTrue();
       assertThat(binaryString.checkOnesSegment("1")).isTrue();
       assertThat(binaryString.checkOnesSegment("11")).isTrue();
       assertThat(binaryString.checkOnesSegment("1000")).isTrue();
    }
}
