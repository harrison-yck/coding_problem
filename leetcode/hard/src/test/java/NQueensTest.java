import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class NQueensTest {

    @Test
    void solveNQueens() {
        NQueens nQueens = new NQueens();
        assertThat(nQueens.solveNQueens(4).containsAll(List.of(List.of(".Q..", "...Q", "Q...", "..Q."), List.of("..Q.", "Q...", "...Q", ".Q.."))));
    }
}