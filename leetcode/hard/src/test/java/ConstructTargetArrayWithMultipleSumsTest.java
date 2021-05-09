import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ConstructTargetArrayWithMultipleSumsTest {

    @Test
    void isPossible() {
        ConstructTargetArrayWithMultipleSums constructTargetArrayWithMultipleSums = new ConstructTargetArrayWithMultipleSums();
        assertThat(constructTargetArrayWithMultipleSums.isPossible(new int[]{9, 3, 5})).isTrue();
        assertThat(constructTargetArrayWithMultipleSums.isPossible(new int[]{1, 1, 1, 2})).isFalse();
        assertThat(constructTargetArrayWithMultipleSums.isPossible(new int[]{8, 5})).isTrue();
        assertThat(constructTargetArrayWithMultipleSums.isPossible(new int[]{1})).isTrue();
    }
}
