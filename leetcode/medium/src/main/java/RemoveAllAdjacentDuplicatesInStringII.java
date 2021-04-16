import java.util.Arrays;

/**
 * @author harrison
 */
public class RemoveAllAdjacentDuplicatesInStringII {
    public String removeDuplicates(String s, int k) {
        int dupCount = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == s.charAt(i)) dupCount++;
            else dupCount = 1;

            if (dupCount == k) s = removeDuplicates(s.substring(0, i - k + 1) + s.substring(i + 1), k);
        }
        return s;
    }

// lee215 approach
// using two pointer to keep track of previous and current char
// move i back until that char is less than k

//    public String removeDuplicates(String s, int k) {
//        int i = 0, n = s.length();
//
//        int[] count = new int[n];
//        char[] stack = s.toCharArray();
//        for (int j = 0; j < n; i++, j++) {
//            stack[i] = stack[j];
//            count[i] = i > 0 && stack[i - 1] == stack[j] ? count[i - 1] + 1 : 1;
//            if (count[i] == k) i -= k;
//        }
//        return new String(stack, 0, i);
//    }
}
