import java.util.List;

/**
 * @author harrison
 */

/*
    524. Longest Word in Dictionary through Deleting
*/

public class FindLongestWordThroughDeleting {
    public static String solve(String s, List<String> d) {
        String res = "";
        for (String str: d) {
            if ((str.length() > res.length() || str.length() == res.length() && str.compareTo(res) < 0) && canForm(s, str)) res = str;
        }
        return res;
    }

    private static boolean canForm(String original, String target) {
        int targetIndex = 0;
        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) == target.charAt(targetIndex)) {
                targetIndex++;
                if (targetIndex == target.length()) return true;
            }
        }
        return false;
    }
}
