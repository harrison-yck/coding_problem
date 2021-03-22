import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class VowelSpellcheckerTest {
    @Test
    void spellchecker() {
        assertThat(VowelSpellchecker.spellchecker(
                new String[]{"KiTe","kite","hare","Hare"},
                new String[]{"kite","Kite","KiTe","Hare","HARE","Hear","hear","keti","keet","keto"}))
                .isEqualTo(new String[]{"kite","KiTe","KiTe","Hare","hare","","","KiTe","","KiTe"});
    }
}
