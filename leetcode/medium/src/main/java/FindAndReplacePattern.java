import java.util.ArrayList;
import java.util.List;

/**
 * @author harrison
 */
public class FindAndReplacePattern {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> samePattern = new ArrayList<>();

        char[] patternChars = pattern.toCharArray();
        for (String s : words) {
            char[] map = new char[26];
            boolean[] used = new boolean[26];
            boolean valid = true;

            char[] wordChars = s.toCharArray();
            for (int i = 0; i < patternChars.length; i++) {
                char p = patternChars[i];
                char value = map[p - 'a'];

                if (value == '\0') {
                    if (used[wordChars[i] - 'a']) {
                        valid = false;
                        break;
                    }
                    map[p - 'a'] = wordChars[i];
                    used[wordChars[i] - 'a'] = true;
                } else {
                    if (value != wordChars[i]) {
                        valid = false;
                        break;
                    }
                }
            }
            if (valid) samePattern.add(s);
        }

        return samePattern;
    }
}
