import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class OnesAndZerosTest {

    @Test
    void findMaxForm() {
        OnesAndZeros onesAndZeros = new OnesAndZeros();
        assertThat(onesAndZeros.findMaxForm(new String[]{"10", "0001", "111001", "1", "0"}, 5, 3)).isEqualTo(4);
        assertThat(onesAndZeros.findMaxForm(new String[]{"10", "0001", "111001", "1", "0"}, 4, 3)).isEqualTo(3);
        assertThat(onesAndZeros.findMaxForm(new String[]{"10","0","1"}, 1, 1)).isEqualTo(2);
        assertThat(onesAndZeros.findMaxForm(new String[]{"111","1000","1000","1000"}, 9, 3)).isEqualTo(3);
    }
}
