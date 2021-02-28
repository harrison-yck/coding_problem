import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MaximumFrequencyStackTest {
    @Test
    void test() {
        var stack = new MaximumFrequencyStack();
        stack.push(5);
        stack.push(7);
        stack.push(5);
        stack.push(7);
        stack.push(4);
        stack.push(5);

        assertThat(stack.pop()).isEqualTo(5);
        assertThat(stack.pop()).isEqualTo(7);
        assertThat(stack.pop()).isEqualTo(5);
        assertThat(stack.pop()).isEqualTo(4);
    }
}
