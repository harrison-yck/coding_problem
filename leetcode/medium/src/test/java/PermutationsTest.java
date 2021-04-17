import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PermutationsTest {
    @Test
    void permute() {
        Permutations permutations = new Permutations();
        assertThat(permutations.permute(new int[]{1, 2, 3})).isEqualTo(List.of(
                List.of(1, 2, 3), List.of(1, 3, 2), List.of(2, 1, 3), List.of(2, 3, 1), List.of(3, 1, 2), List.of(3, 2, 1)
        ));
    }
}
