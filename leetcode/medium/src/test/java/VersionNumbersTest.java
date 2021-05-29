import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class VersionNumbersTest {
    VersionNumbers versionNumbers;

    @BeforeEach
    void init() {
        versionNumbers = new VersionNumbers();
    }

    @Test
    void test1(){
        assertThat(versionNumbers.compareVersion("1.01", "1.001")).isEqualTo(0);
    }

    @Test
    void test2() {
        assertThat(versionNumbers.compareVersion("1.0", "1.0.0")).isEqualTo(0);
    }

    @Test
    void test3() {
        assertThat(versionNumbers.compareVersion("0.1", "1.1")).isEqualTo(-1);
    }

    @Test
    void test4() {
        assertThat(versionNumbers.compareVersion("1.0.1", "1")).isEqualTo(1);
    }

    @Test
    void test5() {
        assertThat(versionNumbers.compareVersion("7.5.2.4", "7.5.3")).isEqualTo(-1);
    }
}
