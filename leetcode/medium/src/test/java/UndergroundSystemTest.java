import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UndergroundSystemTest {

    @Test
    void getAverageTime() {
        var system = new UndergroundSystem();
        system.checkIn(45, "Leyton", 3);
        system.checkIn(32, "Paradise", 8);
        system.checkIn(27, "Leyton", 10);
        system.checkOut(45, "Waterloo", 15);
        system.checkOut(27, "Waterloo", 20);
        system.checkOut(32, "Cambridge", 22);

        assertThat(system.getAverageTime("Paradise", "Cambridge")).isEqualTo(14.00000);
        assertThat(system.getAverageTime("Leyton", "Waterloo")).isEqualTo(11.00000);

        system.checkIn(10, "Leyton", 24);
        assertThat(system.getAverageTime("Leyton", "Waterloo")).isEqualTo(11.00000);
        system.checkOut(10, "Waterloo", 38);
        assertThat(system.getAverageTime("Leyton", "Waterloo")).isEqualTo(12.00000);
    }
}
