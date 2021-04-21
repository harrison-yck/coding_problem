import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    @Test
    void test() {
        Triangle triangle = new Triangle();
        List<List<Integer>> testData = List.of(List.of(2), List.of(3, 4), List.of(6, 5, 7), List.of(4, 1, 8, 3));

        assertThat(triangle.bottomUpMinimumTotal(testData)).isEqualTo(11);
        assertThat(triangle.topDownMinimumTotal(testData)).isEqualTo(11);
    }
}
