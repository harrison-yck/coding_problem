import java.util.ArrayList;
import java.util.List;

/**
 * @author harrison
 */
public class CountPrimes {
    public int countPrimes(int n) {
        if (n <= 2) return 0;

        boolean[] notPrime = new boolean[n];
        for (int i = 2; i * i <= n; i++) {
            if (notPrime[i]) continue;
            for (int j = i * i; j < n; j += i) notPrime[j] = true;
        }

        int numOfPrime = 1;
        for (int i = 3; i < n; i += 2) {
            if (!notPrime[i]) numOfPrime++;
        }

        return numOfPrime;
    }
}
