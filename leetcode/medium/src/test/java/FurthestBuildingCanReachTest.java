import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FurthestBuildingCanReachTest {
    @Test
    void test() {
        FurthestBuildingCanReach furthestBuildingCanReach = new FurthestBuildingCanReach();
        assertThat(furthestBuildingCanReach.furthestBuilding(new int[]{4, 12, 2, 7, 3, 18, 20, 3, 19}, 10, 2)).isEqualTo(7);
        assertThat(furthestBuildingCanReach.furthestBuilding(new int[]{14, 3, 19, 3}, 17, 0)).isEqualTo(3);
        assertThat(furthestBuildingCanReach.furthestBuilding(new int[]{7, 5, 13}, 0, 0)).isEqualTo(1);
        assertThat(furthestBuildingCanReach.furthestBuilding(new int[]{1, 2}, 0, 0)).isEqualTo(0);
    }
}
