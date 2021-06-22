import java.util.HashMap;
import java.util.Map;

/**
 * @author harrison
 */
public class NumberOfMatchingSubsequence {
    private final Map<String, Boolean> cache = new HashMap<>();

    public int numMatchingSubseq(String s, String[] words) {
        int numOfMatching = 0;

        for (String word : words) {
            Boolean isSubsequence = cache.computeIfAbsent(word, key -> isSubsequence(s, word));
            if (isSubsequence) numOfMatching++;
            cache.putIfAbsent(word, isSubsequence);
        }

        return numOfMatching;
    }

    private boolean isSubsequence(String original, String potentialSubsequence) {
        int i = 0, j = 0, l1 = original.length(), l2 = potentialSubsequence.length();

        while (i < l1 && j < l2) {
            if (original.charAt(i) == potentialSubsequence.charAt(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }

        return j == potentialSubsequence.length();
    }
}
