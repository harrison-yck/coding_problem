/**
 * @author harrison
 */
public class RomanToInt {
    public int solve(String s) {
        char[] chars = s.toCharArray();
        int sum = 0;
        int lastValue = 0;
        for(int i = chars.length - 1; i >= 0; i--) {
            int value = charToInt(chars[i]);

            if (lastValue <= value) {
                sum += value;
            } else {
                sum -= value;
            }

            lastValue = value;
        }
        return sum;
    }

    private int charToInt(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}
