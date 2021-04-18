import java.util.Arrays;

/**
 * @author harrison
 */
public class MaximumIceCreamBars {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count = 0;

        for (int cost: costs) {
            if (coins - cost >= 0) {
                count++;
                coins -= cost;
            } else {
                break;
            }
        }

        return count;
    }
}
