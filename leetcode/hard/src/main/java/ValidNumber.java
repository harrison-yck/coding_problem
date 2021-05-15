import java.util.regex.Pattern;

/**
 * @author harrison
 */
public class ValidNumber {
    public boolean isNumber(String s) {
        try {
            int length = s.length();
            if (length == 0) return false;

            char lastChar = s.charAt(length - 1);
            int lastCharToInt = lastChar - '0';
            if (lastChar != '.' && (lastCharToInt < 0 || lastCharToInt > 9)) return false; // last char must be an integer

            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
}
