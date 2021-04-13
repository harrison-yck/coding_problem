/**
 * @author harrison
 */
public class BeautifulArrangementII {
    public int[] constructArray(int n, int k) {
        int[] arr = new int[n];

        int left = 1, right = n;
        for (int i = 0; i < n; i++) {
            arr[i] = k % 2 != 0 ? left++ : right--;

            if (k > 1) k--;
        }
        return arr;
    }
}
