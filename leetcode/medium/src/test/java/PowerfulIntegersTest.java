import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PowerfulIntegersTest {
    @Test
    void test() {
        PowerfulIntegers powerfulIntegers = new PowerfulIntegers();
        assertThat(powerfulIntegers.powerfulIntegers(2, 3, 10)).isEqualTo(List.of(2, 3, 4, 5, 7, 9, 10));
        assertThat(powerfulIntegers.powerfulIntegers(3, 5, 15)).isEqualTo(List.of(2, 4, 6, 8, 10, 14));
    }
}
