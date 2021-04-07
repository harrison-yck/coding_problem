import java.util.HashSet;
import java.util.Set;

/**
 * @author harrison
 */
public class DetermineIfStringHalvesAreAlike {
    private final Set<Character> VOWELS = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

    public boolean halvesAreAlike(String s) {
        int countA = 0, countB = 0;
        int length = s.length();

        for (int i = 0; i < length / 2; i++) if (VOWELS.contains(s.charAt(i))) countA++;
        for (int i = length / 2; i < length; i++) if (VOWELS.contains(s.charAt(i))) countB++;

        return countA == countB;
    }
}
