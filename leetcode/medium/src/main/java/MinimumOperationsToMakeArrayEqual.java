/**
 * @author harrison
 */
public class MinimumOperationsToMakeArrayEqual {
//    public int minOperations(int n) {
//        int count = 0;
//        for (int i = n - 1; i >= 0; i--) {
//            int fn = 2 * i + 1;
//            if (fn <= n) break;
//            count += fn - n;
//        }
//        return count;
//    }

    public int minOperations(int n) {
        return n * n / 4; // arithmetic sequence factorization, explanation: https://leetcode.com/problems/minimum-operations-to-make-array-equal/discuss/794163/Java-2-Lines
    }
}
