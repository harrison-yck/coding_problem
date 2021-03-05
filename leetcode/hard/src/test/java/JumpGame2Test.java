import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class JumpGame2Test {
    @Test
    void jump() {
        assertThat(JumpGame2.jump(new int[]{2, 3, 1, 1, 4})).isEqualTo(2);
        assertThat(JumpGame2.jump(new int[]{2, 3, 0, 1, 4})).isEqualTo(2);
        assertThat(JumpGame2.jump(new int[]{2, 1})).isEqualTo(1);
        assertThat(JumpGame2.jump(new int[]{0})).isEqualTo(0);
    }
}
