import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MatchsticksToSquareTest {

    @Test
    void makesquare() {
        assertThat(MatchsticksToSquare.makesquare(new int[]{1, 1, 2, 2, 2})).isEqualTo(true);
        assertThat(MatchsticksToSquare.makesquare(new int[]{3, 3, 3, 3, 4})).isEqualTo(false);
        assertThat(MatchsticksToSquare.makesquare(new int[]{1,2,3,4,5,6,7,8,9,10,5,4,3,2,1})).isEqualTo(false);
    }
}
