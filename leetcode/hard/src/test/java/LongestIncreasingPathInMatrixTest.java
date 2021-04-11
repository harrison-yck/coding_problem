import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LongestIncreasingPathInMatrixTest {

    @Test
    void longestIncreasingPath() {
        LongestIncreasingPathInMatrix longestIncreasingPathInMatrix = new LongestIncreasingPathInMatrix();
        assertThat(longestIncreasingPathInMatrix.longestIncreasingPath(new int[][]{{9, 9, 4}, {6, 6, 8}, {2, 1, 1}})).isEqualTo(4);
        assertThat(longestIncreasingPathInMatrix.longestIncreasingPath(new int[][]{{3, 4, 5}, {3, 2, 6}, {2, 2, 1}})).isEqualTo(4);
        assertThat(longestIncreasingPathInMatrix.longestIncreasingPath(new int[][]{{1, 2}})).isEqualTo(2);
    }
}
