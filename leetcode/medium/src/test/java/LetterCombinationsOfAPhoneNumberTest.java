import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LetterCombinationsOfAPhoneNumberTest {

    @Test
    void letterCombinations() {
        LetterCombinationsOfAPhoneNumber letterCombinationsOfAPhoneNumber = new LetterCombinationsOfAPhoneNumber();
        assertThat(letterCombinationsOfAPhoneNumber.letterCombinations("23")).containsAll(List.of("ad", "ae", "af", "bd", "bd", "bf", "cd", "ce", "cf"));
        assertThat(letterCombinationsOfAPhoneNumber.letterCombinations("2")).containsAll(List.of("a", "b", "c"));
        assertThat(letterCombinationsOfAPhoneNumber.letterCombinations("")).isEqualTo(List.of());
    }
}
