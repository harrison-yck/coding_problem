import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class KeysAndRoomsTest {

    @Test
    void canVisitAllRooms() {
        assertThat(KeysAndRooms.canVisitAllRooms(lists(list(1), list(2), list(3), list()))).isTrue();
        assertThat(KeysAndRooms.canVisitAllRooms(lists(list(1, 3), list(3, 0, 1), list(2), list(0)))).isFalse();
        assertThat(KeysAndRooms.canVisitAllRooms(lists(list(2), list(), list(1)))).isTrue();
    }

    @SafeVarargs
    private List<List<Integer>> lists(List<Integer>... lists) {
        return List.of(lists);
    }

    private List<Integer> list(Integer... integers) {
        return List.of(integers);
    }
}
