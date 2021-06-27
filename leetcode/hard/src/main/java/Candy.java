import java.util.Arrays;

/**
 * @author harrison
 */
public class Candy {
    public static void main(String[] args) {
        System.out.println(candy(new int[]{1, 3, 4, 5, 2}));
    }

    public static int candy(int[] ratings) {
        int[] candies = new int[ratings.length];
        Arrays.fill(candies, 1);

        // handle incremental
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        int sum = candies[ratings.length - 1];

        // handle decremental
        for (int i = ratings.length - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1); // peak or not peak
            }

            sum += candies[i];
        }

        return sum;
    }
}
