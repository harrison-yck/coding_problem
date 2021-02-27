import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class DivideTwoIntegersTest {
    @Test
    void divide() {
        assertThat(DivideTwoIntegers.divide(10, 3)).isEqualTo(3);
        assertThat(DivideTwoIntegers.divide(7, -3)).isEqualTo(-2);
        assertThat(DivideTwoIntegers.divide(0, 1)).isEqualTo(0);
        assertThat(DivideTwoIntegers.divide(1, 1)).isEqualTo(1);
        assertThat(DivideTwoIntegers.divide(-2147483648, -1)).isEqualTo(2147483647);
        assertThat(DivideTwoIntegers.divide(-2147483648, 1)).isEqualTo(-2147483648);
        assertThat(DivideTwoIntegers.divide(-2147483648, 2)).isEqualTo(-1073741824);
    }
}
