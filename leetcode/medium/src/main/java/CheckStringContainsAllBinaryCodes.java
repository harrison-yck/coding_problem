import java.util.HashSet;
import java.util.Set;

/**
 * @author harrison
 */
public class CheckStringContainsAllBinaryCodes {
    public static boolean setFindAllCodes(String s, int k) {
        int targetSize = (int) Math.pow(2, k);
        Set<String> combinations = new HashSet<>(targetSize);

        for (int i = 0; i <= s.length() - k; i++) {
            String substring = s.substring(i, i + k);
            combinations.add(substring);
        }

        return combinations.size() == targetSize;
    }
}
