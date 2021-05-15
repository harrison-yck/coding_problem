/**
 * @author harrison
 */
public class ValidNumber {
    public boolean isNumber(String s) {
        try {
            int length = s.length();
            if (length == 0) return false;

            // last char must be an integer
            char lastChar = s.charAt(length - 1);
            if (lastChar != '.' && !Character.isDigit(lastChar)) return false;

            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    public boolean isNumberV2(String s) {
        boolean hasDot = false;
        boolean hasE = false;
        boolean hasNumber = false;
        short signCount = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                hasNumber = true;
            } else if (c == 'e' || c == 'E') {
                if (hasE || !hasNumber) return false;
                hasE = true;
                hasNumber = false;
            } else if (c == '.') {
                if (hasE || hasDot) return false;
                hasDot = true;
            } else if (c == '+' || c == '-') {
                if (signCount >= 2 || i > 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') return false;
                signCount++;
            } else {
                return false;
            }
        }
        return hasNumber;
    }
}
