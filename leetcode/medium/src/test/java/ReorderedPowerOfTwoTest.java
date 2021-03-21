import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReorderedPowerOfTwoTest {
    @Test
    void reorderedPowerOf2() {
        assertThat(ReorderedPowerOfTwo.reorderedPowerOf2(1)).isTrue();
        assertThat(ReorderedPowerOfTwo.reorderedPowerOf2(10)).isFalse();
        assertThat(ReorderedPowerOfTwo.reorderedPowerOf2(16)).isTrue();
        assertThat(ReorderedPowerOfTwo.reorderedPowerOf2(24)).isFalse();
        assertThat(ReorderedPowerOfTwo.reorderedPowerOf2(46)).isTrue();
    }
}
