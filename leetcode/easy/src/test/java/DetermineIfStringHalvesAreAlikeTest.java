import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class DetermineIfStringHalvesAreAlikeTest {

    @Test
    void halvesAreAlike() {
        DetermineIfStringHalvesAreAlike determineIfStringHalvesAreAlike = new DetermineIfStringHalvesAreAlike();
        assertThat(determineIfStringHalvesAreAlike.halvesAreAlike("book")).isTrue();
        assertThat(determineIfStringHalvesAreAlike.halvesAreAlike("textbook")).isFalse();
        assertThat(determineIfStringHalvesAreAlike.halvesAreAlike("MerryChristmas")).isFalse();
        assertThat(determineIfStringHalvesAreAlike.halvesAreAlike("AbCdEfGh")).isTrue();
        assertThat(determineIfStringHalvesAreAlike.halvesAreAlike("Uaec")).isFalse();
    }
}
