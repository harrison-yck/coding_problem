import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author harrison
 */
public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generate(result, new char[n * 2], 0);
        return result;
    }

    private void generate(List<String> result, char[] chars, int i) {
        if (i == chars.length) {
            if (isValid(chars)) result.add(String.valueOf(chars));
            return;
        }

        chars[i] = '(';
        generate(result, chars, i + 1);

        chars[i] = ')';
        generate(result, chars, i + 1);
    }

    private boolean isValid(char[] chars) {
        int opened = 0;
        for (char c : chars) {
            if (opened < 0) return false;

            if (c == '(') opened++;
            else opened--;
        }
        return opened == 0;
    }
}
