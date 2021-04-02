import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FindCommonCharactersTest {

    @Test
    void commonChars() {
        var findCommonCharacters = new FindCommonCharacters();
        assertThat(findCommonCharacters.commonChars(new String[]{"bella","label","roller"})).isEqualTo(Lists.list("e","l","l"));
    }
}
