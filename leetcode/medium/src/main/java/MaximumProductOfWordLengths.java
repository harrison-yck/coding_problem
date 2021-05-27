/**
 * @author harrison
 */
public class MaximumProductOfWordLengths {
    public int maxProduct(String[] words) {
        int[] bits = new int[words.length];

        for (int i = 0; i < words.length; i ++) {
            int bit = 0;
            for (char c: words[i].toCharArray()) bit |= (1 << (c - 'a'));
            bits[i] = bit;
        }

        int max = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if ((bits[i] & bits[j]) == 0) max = Math.max(max, words[i].length() * words[j].length());
            }
        }
        return max;
    }
}
