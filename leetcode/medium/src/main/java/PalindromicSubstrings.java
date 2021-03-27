/**
 * @author harrison
 */
public class PalindromicSubstrings {
    public static int countSubstrings(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count += expandFromCenter(s, i, i);
            count += expandFromCenter(s, i, i + 1);
        }

        return count;
    }

    private static int expandFromCenter(String s, int firstCenterCharIndex, int secondCenterCharIndex) {
        int count = 0;

        while (firstCenterCharIndex >= 0 && secondCenterCharIndex < s.length()) {
            if (s.charAt(firstCenterCharIndex) != s.charAt(secondCenterCharIndex)) break;

            firstCenterCharIndex--;
            secondCenterCharIndex++;
            count++;
        }

        return count;
    }
}
