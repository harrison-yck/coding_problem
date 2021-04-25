import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RotateImageTest {

    @Test
    void rotate() {
        RotateImage rotateImage = new RotateImage();
        assertThat(rotateImage.rotateLBL(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}})).isEqualTo(new int[][]{{7, 4, 1}, {8, 5, 2}, {9, 6, 3}});
        assertThat(rotateImage.rotateByInverseAndReverse(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}})).isEqualTo(new int[][]{{7, 4, 1}, {8, 5, 2}, {9, 6, 3}});
    }
}
