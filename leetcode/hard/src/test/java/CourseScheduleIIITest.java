import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CourseScheduleIIITest {
    @Test
    void test() {
        CourseScheduleIII courseScheduleIII = new CourseScheduleIII();
        assertThat(courseScheduleIII.scheduleCourse(new int[][]{{100, 200}, {200, 1300}, {1000, 1250}, {2000, 3200}})).isEqualTo(3);
        assertThat(courseScheduleIII.scheduleCourse(new int[][]{{1, 2}})).isEqualTo(1);
        assertThat(courseScheduleIII.scheduleCourse(new int[][]{{3, 2}, {4, 3}})).isEqualTo(0);
        assertThat(courseScheduleIII.scheduleCourse(new int[][]{{5, 5}, {4, 6}, {2, 6}})).isEqualTo(2);
        assertThat(courseScheduleIII.scheduleCourse(new int[][]{{5, 15}, {3, 19}, {6, 7}, {2, 10}, {5, 16}, {8, 14}, {10, 11}, {2, 19}})).isEqualTo(5);
    }
}
