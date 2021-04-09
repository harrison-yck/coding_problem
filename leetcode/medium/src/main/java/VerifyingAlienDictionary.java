import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author harrison
 */
public class VerifyingAlienDictionary {
    public boolean isAlienSorted(String[] words, String order) {
        for (int i = 1; i < words.length; i++) {
            String firstWord = words[i - 1];
            String secondWord = words[i];

            int firstLength = firstWord.length();
            int secondLength = secondWord.length();
            int length = Math.min(firstWord.length(), secondWord.length());

            for (int j = 0; j < length; j++) {
                int a = order.indexOf(firstWord.charAt(j));
                int b = order.indexOf(secondWord.charAt(j));

                if (a > b) return false;
                else if (b > a) break;
                else if ((firstLength - 1 == j || secondLength - 1 == j) && firstLength > secondLength) return false;
            }
        }

        return true;
    }
}
