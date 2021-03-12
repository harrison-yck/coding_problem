import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CoinChangeTest {

    @Test
    void iterativeTopDown() {
        assertThat(CoinChange.iterativeBottomUp(new int[]{1, 2, 5}, 11)).isEqualTo(3);
        assertThat(CoinChange.iterativeBottomUp(new int[]{2}, 3)).isEqualTo(-1);
        assertThat(CoinChange.iterativeBottomUp(new int[]{1}, 0)).isEqualTo(0);
        assertThat(CoinChange.iterativeBottomUp(new int[]{1}, 1)).isEqualTo(1);
        assertThat(CoinChange.iterativeBottomUp(new int[]{1}, 2)).isEqualTo(2);
        assertThat(CoinChange.iterativeBottomUp(new int[]{186, 419, 83, 408}, 6249)).isEqualTo(20);
    }

    @Test
    void recursiveTopDown() {
        assertThat(CoinChange.recursiveTopDown(new int[]{1, 2, 5}, 11)).isEqualTo(3);
        assertThat(CoinChange.recursiveTopDown(new int[]{2}, 3)).isEqualTo(-1);
        assertThat(CoinChange.recursiveTopDown(new int[]{1}, 0)).isEqualTo(0);
        assertThat(CoinChange.recursiveTopDown(new int[]{1}, 1)).isEqualTo(1);
        assertThat(CoinChange.recursiveTopDown(new int[]{1}, 2)).isEqualTo(2);
        assertThat(CoinChange.recursiveTopDown(new int[]{186, 419, 83, 408}, 6249)).isEqualTo(20);
    }
}
