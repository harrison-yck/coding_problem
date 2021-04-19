import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CombinationSumIVTest {
    @Test
    void test() {
        CombinationSumIV combinationSumIV = new CombinationSumIV();
        assertThat(combinationSumIV.combinationSum4(new int[]{1,2,3}, 4)).isEqualTo(7);
        assertThat(combinationSumIV.combinationSum4(new int[]{9}, 3)).isEqualTo(0);
    }
}