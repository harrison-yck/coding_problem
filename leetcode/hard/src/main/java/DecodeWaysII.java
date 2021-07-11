/**
 * @author harrison
 */
public class DecodeWaysII {
    private static final int MOD = 1_000_000_007;

    public static void main(String[] args) {
        System.out.println(numDecodings("*"));
        System.out.println(numDecodings("1*"));
        System.out.println(numDecodings("2*"));
    }

//    public static int numDecodings(String s) {
//        long [] dp = new long[s.length() + 1];
//        dp[0] = 1;
//        dp[1] = oneDigit(s.charAt(0));
//
//        for (int i = 1; i < s.length(); i++) {
//            long firstWay = oneDigit(s.charAt(i)) * dp[i];
//            long secondWay = twoDigits(s.charAt(i - 1), s.charAt(i)) * dp[i - 1];
//            dp[i + 1] = ((firstWay % MOD) + (secondWay % MOD)) % MOD;
//        }
//
//        return (int) dp[s.length()];
//    }

    public static int numDecodings(String s) {
        long current = 1, previous = 1;

        for (int i = 0; i < s.length(); i++) {
            long firstWay = oneDigit(s.charAt(i)) * current;
            long secondWay = i == 0 ? 0 : twoDigits(s.charAt(i - 1), s.charAt(i)) * previous;

            previous = current;
            current = firstWay + secondWay;

            if (current == 0) return 0;
            current %= MOD;
        }

        return (int) current;
    }

    private static long oneDigit(char a) {
        return switch (a) {
            case '*' -> 9;
            case '0' -> 0;
            default -> 1;
        };
    }

    private static long twoDigits(char a, char b) {
        if (a == '*') {
            if (b == '*') {
                return 15;
            } else if (b >= '0' && b <= '6') {
                return 2;
            } else {
                return 1;
            }
        } else if (b == '*') {
            return switch (a) {
                case '1' -> 9;
                case '2' -> 6;
                default -> 0;
            };
        } else {
            int num = 10 * (a - '0') + (b - '0');

            if (num >= 10 && num <= 26) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}
