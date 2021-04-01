import java.util.ArrayList;
import java.util.List;

/**
 * @author harrison
 */
public class WordSubset {
    public static List<String> wordSubsets(String[] A, String[] B) {
        int[] countB = new int[26];
        for (String s : B) {
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                int charIndex = c - 'a';
                countB[charIndex] = Math.max(countB[charIndex], ++count[charIndex]); // count occurrence of all characters in B
            }
        }

        List<String> result = new ArrayList<>();
        for (String s: A) {
            int[] countA = new int[26];
            for (char c: s.toCharArray()) countA[c - 'a']++; // count occurrence of each String in A

            boolean passed = true;
            for (int i = 0; i < 26; i++) {
                if (countB[i] > countA[i]) { // String of A has not enough character to form subset
                    passed = false;
                    break;
                }
            }

            if (passed) result.add(s);
        }

        return result;
    }
}
