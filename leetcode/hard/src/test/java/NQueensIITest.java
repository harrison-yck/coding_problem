import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class NQueensIITest {

    @Test
    void totalNQueens() {
        NQueensII nQueensII = new NQueensII();
        assertThat(nQueensII.totalNQueens(4)).isEqualTo(2);
    }
}
