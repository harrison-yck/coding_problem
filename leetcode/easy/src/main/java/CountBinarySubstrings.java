import java.util.HashSet;
import java.util.Set;

/**
 * @author harrison
 */
public class CountBinarySubstrings {
    public int countBinarySubstrings(String s) {
        if (s.length() < 2) return 0;

        int totalSubstring = 1, previous = 0, current = 0;
        char[] chars = s.toCharArray();
        for (int i = 1; i < chars.length; i++) {
            if (chars[i - 1] != chars[i]) {
                totalSubstring += Math.min(previous, current);
                previous = current;
                current = 1;
            } else {
                current++;
            }
        }
        return totalSubstring + Math.min(previous, current);
    }
}
