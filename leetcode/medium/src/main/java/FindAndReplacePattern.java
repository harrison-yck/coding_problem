import java.util.ArrayList;
import java.util.List;

/**
 * @author harrison
 */
public class FindAndReplacePattern {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        char[] patternChars = pattern.toCharArray();
        List<String> samePattern = new ArrayList<>();
        for (String word : words) if (isValid(word, patternChars)) samePattern.add(word);
        return samePattern;
    }

    private boolean isValid(String word, char[] patternChars) {
        char[] map = new char[26];
        int used = 0;

        char[] wordChars = word.toCharArray();
        for (int i = 0; i < patternChars.length; i++) {
            char p = patternChars[i];
            char c = wordChars[i];
            char value = map[p - 'a'];

            // hit but not equal
            if (value != 0 && value != c) return false;

            // not hit
            if (value == 0) {
                int location = 1 << (c - 'a');

                // used
                if ((used & location) != 0) return false;
                map[p - 'a'] = c;
                used |= location; // set value
            }
        }
        return true;
    }
}
