import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellWithTransactionFeeTest {
    @Test
    void maxProfit() {
        assertThat(BestTimeToBuyAndSellWithTransactionFee.maxProfit(new int[]{1, 3, 2, 8, 4, 9}, 2)).isEqualTo(8);
        assertThat(BestTimeToBuyAndSellWithTransactionFee.maxProfit(new int[]{1, 3, 7, 5, 10, 3}, 3)).isEqualTo(6);
    }
}
