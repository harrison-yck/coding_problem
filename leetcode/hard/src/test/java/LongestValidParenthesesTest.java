import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LongestValidParenthesesTest {

    @Test
    void longestValidParentheses() {
        LongestValidParentheses longestValidParentheses = new LongestValidParentheses();
        assertThat(longestValidParentheses.longestValidParentheses("(()")).isEqualTo(2);
        assertThat(longestValidParentheses.longestValidParentheses(")()())")).isEqualTo(4);
        assertThat(longestValidParentheses.longestValidParentheses("")).isEqualTo(0);
        assertThat(longestValidParentheses.longestValidParentheses("()(())")).isEqualTo(6);
        assertThat(longestValidParentheses.longestValidParentheses("()(()")).isEqualTo(2);
        assertThat(longestValidParentheses.longestValidParentheses(")())()()")).isEqualTo(4);
    }
}
