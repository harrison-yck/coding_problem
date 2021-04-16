/**
 * @author harrison
 */
public class RemoveAllAdjacentDuplicatesInStringII {
    public String removeDuplicates(String s, int k) {
        int[] count = new int[26];
        int[] countB = new int[26];

        for (char c : s.toCharArray()) {
            int index = c - 'a';
            count[index]++;
        }

        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            int index = c - 'a';
            if (count[index] % k != 0) {
                countB[index]++;

                if (count[i])
                sb.append(c);
                count[index]--;
            }
        }
        return sb.toString();
    }
}
