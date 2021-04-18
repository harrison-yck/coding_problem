import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MaximumIceCreamBarsTest {
    @Test
    void test() {
        MaximumIceCreamBars maximumIceCreamBars = new MaximumIceCreamBars();
        assertThat(maximumIceCreamBars.maxIceCream(new int[]{1,3,2,4,1}, 7)).isEqualTo(4);
        assertThat(maximumIceCreamBars.maxIceCream(new int[]{10,6,8,7,7,8}, 5)).isEqualTo(0);
        assertThat(maximumIceCreamBars.maxIceCream(new int[]{1,6,3,1,2,5}, 20)).isEqualTo(6);
    }
}
