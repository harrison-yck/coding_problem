import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author harrison
 */
public class FindCommonCharacters {
    public List<String> commonChars(String[] A) {
        int[] globalCount = new int[26];
        Arrays.fill(globalCount, Integer.MAX_VALUE);

        for (String s : A) {
            int[] localCount = new int[26];
            for (char c : s.toCharArray()) localCount[c - 'a']++;
            for (int i = 0; i < 26; i++) globalCount[i] = Math.min(globalCount[i], localCount[i]);
        }

        List<String> dup = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            for (int count = globalCount[i]; count > 0; --count) {
                dup.add(String.valueOf((char) (i + 'a')));
            }
        }
        return dup;
    }
}
