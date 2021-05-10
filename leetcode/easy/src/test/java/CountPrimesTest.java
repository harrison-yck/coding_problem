import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CountPrimesTest {
    @Test
    void test() {
        CountPrimes countPrimes = new CountPrimes();
        assertThat(countPrimes.countPrimes(0)).isEqualTo(0);
        assertThat(countPrimes.countPrimes(1)).isEqualTo(0);
        assertThat(countPrimes.countPrimes(2)).isEqualTo(0);
        assertThat(countPrimes.countPrimes(10)).isEqualTo(4);
        assertThat(countPrimes.countPrimes(499979)).isEqualTo(41537);
    }
}
