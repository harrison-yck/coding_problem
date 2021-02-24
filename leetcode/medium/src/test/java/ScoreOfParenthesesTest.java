import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ScoreOfParenthesesTest {
    @Test
    void score() {
        assertThat(ScoreOfParentheses.solve("()")).isEqualTo(1);
        assertThat(ScoreOfParentheses.solve("((()))")).isEqualTo(4);
        assertThat(ScoreOfParentheses.solve("()()()")).isEqualTo(3);
        assertThat(ScoreOfParentheses.solve("(()(()))")).isEqualTo(6);
        assertThat(ScoreOfParentheses.solve("(((())))")).isEqualTo(8);
    }
}
