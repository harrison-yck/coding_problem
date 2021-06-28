/**
 * @author harrison
 */
public class RemoveAllAdjacentDuplicates {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("azxxzy"));
        System.out.println(removeDuplicates("abccbafgabccba"));
    }

    public static String removeDuplicates(String s) {
        char[] stack = new char[s.length()];
        int i = 0;

        for (char c : s.toCharArray()) {
            if (i > 0 && stack[i - 1] == c) {
                stack[i - 1] = 0;
                i--;
            } else {
                stack[i++] = c;
            }
        }
        return new String(stack).trim();
    }
}
