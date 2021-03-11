import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CoinChangeTest {

    @Test
    void iterativeBottomUp() {
        assertThat(CoinChange.iterativeTopDown(new int[]{1, 2, 5}, 11)).isEqualTo(3);
        assertThat(CoinChange.iterativeTopDown(new int[]{2}, 3)).isEqualTo(-1);

        assertThat(CoinChange.recursiveTopDown(new int[]{1, 2, 5}, 11)).isEqualTo(3);
        assertThat(CoinChange.recursiveTopDown(new int[]{2}, 3)).isEqualTo(-1);
    }
}
