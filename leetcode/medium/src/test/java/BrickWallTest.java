import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BrickWallTest {

    @Test
    void leastBricks() {
        BrickWall brickWall = new BrickWall();
        assertThat(brickWall.leastBricks(List.of(List.of(1,2,2,1), List.of(3,1,2), List.of(1,3,2), List.of(2,4), List.of(3,1,2), List.of(1,3,1,1)))).isEqualTo(2);
    }
}
