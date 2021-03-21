import java.util.Arrays;

/**
 * @author harrison
 */

public class ReorderedPowerOfTwo {
    public static boolean reorderedPowerOf2(int N) {
        // If we find all permutation of N to compare with all Power of 2,
        // it can be extremely slow, so we use digit occurrence of N to compare instead

        // 1 <= N <= 1e10, and 2e30 > 1e10
        int[] inputOccurrence = countOccurrence(N);

        for (int i = 0; i < 31; i++) {
            if (Arrays.equals(inputOccurrence, countOccurrence(1 << i))) return true;
        }

        return false;
    }

    private static int[] countOccurrence(int N) {
        int[] occurrence = new int[10];
        while (N > 0) {
            occurrence[N % 10]++;
            N /= 10;
        }
        return occurrence;
    }
}
