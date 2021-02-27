/**
 * @author harrison
 */

/*
    29. Divide Two Integers
 */

public class DivideTwoIntegers {
//    Too slow, exceed time limit
//    public static int divide(int dividend, int divisor) {
//        if (dividend == 0) return dividend;
//        if (divisor == 1) return dividend;
//
//        long absDividend = Math.abs((long)dividend);
//        int absDivisor = Math.abs(divisor);
//
//        int ans = 0;
//        while (absDividend >= absDivisor) {
//            absDividend -= absDivisor;
//            if (ans == Integer.MAX_VALUE) break;
//            ans++;
//        }
//
//        return dividend < 0 && divisor > 0 || dividend > 0 && divisor < 0 ? -ans : ans;
//    }

    public static int divide(int dividend, int divisor) {
        if (dividend == 0 || divisor == 1) return dividend;
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE; // handle edge case, so that we don't have to use long type

        int absDividend = Math.abs(dividend);
        int absDivisor = Math.abs(divisor);
        int ans = 0;

        while (absDividend - absDivisor >= 0) {
            int diff = absDivisor;
            int divideCount = 1;

            while (absDividend - (diff << 1) >= 0) { // similar to above, but instead of incrementing by one, this one is doing *2 using bitwise (cheat?)
                diff <<= 1;
                divideCount <<= 1;
            }

            absDividend -= diff;
            ans += divideCount;
        }

        return (dividend > 0) == (divisor > 0) ?  ans : -ans; // cleaner
    }
}
