import java.util.ArrayList;
import java.util.List;

/**
 * @author harrison
 */
public class FindCommonCharacters {
    public static List<String> commonChars(String[] A) {
        int[] globalCount = new int[26];
        for (int i = 0; i < 26; i++) globalCount[i] = Integer.MAX_VALUE;

        for (String s : A) {
            int[] localCount = new int[26];
            for (char c : s.toCharArray()) localCount[c - 'a']++;
            for (int i = 0; i < 26; i++) globalCount[i] = Math.min(globalCount[i], localCount[i]);
        }

        List<String> dup = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            while (globalCount[i] > 0) {
                dup.add(String.valueOf((char) (i + 'a')));
                globalCount[i]--;
            }
        }
        return dup;
    }
}
