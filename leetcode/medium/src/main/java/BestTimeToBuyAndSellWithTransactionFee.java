/**
 * @author harrison
 */
public class BestTimeToBuyAndSellWithTransactionFee {
    public static int maxProfit(int[] prices, int fee) {
        int donHold = 0, hold = donHold - prices[0];

        for (int i = 1; i < prices.length; i++) {
            donHold = Math.max(donHold, hold + prices[i] - fee); // max = donHold means you haven't buy any yet, max = hold + prices[i] - fee means you sold it
            hold = Math.max(hold, donHold - prices[i]); // max = hold means sold is not worthy, max = donHold - prices[i] means you sold it
        }

        return donHold;
    }
}
