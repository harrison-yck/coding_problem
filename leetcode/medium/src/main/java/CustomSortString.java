/**
 * @author harrison
 */
public class CustomSortString {
    public static void main(String[] args) {
        System.out.println(customSortString("cba", "abcd"));
        System.out.println(customSortString("cba", "dabcbd"));
    }

    public static String customSortString(String order, String str) {
        int[] occurrence = new int[26];

        for (char c : str.toCharArray()) {
            occurrence[c - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        for (char c : order.toCharArray()) {
            while (occurrence[c - 'a'] != 0) {
                sb.append(c);
                occurrence[c - 'a']--;
            }
        }

        for (int i = 0; i < occurrence.length; i++) {
            while (occurrence[i] != 0) {
                sb.append((char) (i + 'a'));
                occurrence[i]--;
            }
        }

        return sb.toString();
    }
}
