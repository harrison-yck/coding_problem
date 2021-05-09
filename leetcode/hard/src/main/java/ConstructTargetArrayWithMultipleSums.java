import java.util.PriorityQueue;

/**
 * @author harrison
 */
public class ConstructTargetArrayWithMultipleSums {
    public boolean isPossible(int[] target) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> (b - a));

        long sum = 0;
        for (int number : target) {
            sum += number;
            pq.add(number);
        }

        while (true) {
            int maxNumber = pq.poll();
            sum -= maxNumber;

            // base case
            if (maxNumber == 1 || sum == 1) return true; // all 1 or [1, N]
            if (maxNumber < sum || sum == 0 || maxNumber % sum == 0) return false;

            // recursive case
            maxNumber %= sum; // important (maxNumber - sum)
            sum += maxNumber;
            pq.add(maxNumber);
        }
    }
}
