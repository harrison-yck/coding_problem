import java.util.ArrayList;
import java.util.List;

/**
 * @author harrison
 */
public class LetterCombinationsOfAPhoneNumber {
    private final String[] charMap = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.isBlank()) return new ArrayList<>();

        List<String> result = new ArrayList<>();
        result.add("");

        for (int i = 0; i < digits.length(); i++) {
            List<String> localResult = new ArrayList<>();
            String digitChars = charMap[digits.charAt(i) - '0'];

            for (int c = 0; c < digitChars.length(); c++) {
                for (String s : result) localResult.add(s + digitChars.charAt(c));
            }

            result = localResult;
        }

        return result;
    }
}
