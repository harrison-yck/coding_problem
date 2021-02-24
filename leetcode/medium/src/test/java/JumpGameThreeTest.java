import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class JumpGameThreeTest {

    @Test
    void canReach() {
        assertThat(JumpGameThree.canReach(new int[]{4,2,3,0,3,1,2}, 5)).isTrue();
        assertThat(JumpGameThree.canReach(new int[]{4,2,3,0,3,1,2}, 0)).isTrue();
        assertThat(JumpGameThree.canReach(new int[]{3,0,2,1,2}, 2)).isFalse();
    }
}
