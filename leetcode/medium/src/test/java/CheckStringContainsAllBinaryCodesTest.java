import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CheckStringContainsAllBinaryCodesTest {
    @Test
    void test() {
        assertThat(CheckStringContainsAllBinaryCodes.setFindAllCodes("00110110", 2)).isTrue();
        assertThat(CheckStringContainsAllBinaryCodes.setFindAllCodes("00110", 2)).isTrue();
    }
}
