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

        int newStringIndex = 0;
        char[] s = new char[str.length()];
        for (char c : order.toCharArray()) {
            while (occurrence[c - 'a'] != 0) {
                s[newStringIndex++] = c;
                occurrence[c - 'a']--;
            }
        }

        for (int i = 0; i < occurrence.length; i++) {
            while (occurrence[i] != 0) {
                s[newStringIndex++] = (char) (i + 'a');
                occurrence[i]--;
            }
        }

        return String.valueOf(s);
    }
}
