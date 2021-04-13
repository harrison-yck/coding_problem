import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BeautifulArrangementIITest {
    @Test
    public void test() {
        BeautifulArrangementII beautifulArrangementII = new BeautifulArrangementII();
        assertThat(beautifulArrangementII.constructArray(3, 1)).isEqualTo(new int[]{1, 2, 3});
        assertThat(beautifulArrangementII.constructArray(3, 2)).isEqualTo(new int[]{3, 1, 2});
    }
}
