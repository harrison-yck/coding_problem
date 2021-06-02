/**
 * @author harrison
 */
public class InterleavingString {
    boolean[][] invalid;

    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) return false;
        invalid = new boolean[s1.length() + 1][s2.length() + 1];
        return dfs(s1, s2, s3, 0, 0, 0);
    }

    public boolean dfs(String s1, String s2, String s3, int i, int j, int k) {
        if (invalid[i][j]) return false;
        if (k == s3.length()) return true;

        boolean path1 = i < s1.length() && s1.charAt(i) == s3.charAt(k) && dfs(s1, s2, s3, i + 1, j, k + 1);
        boolean path2 = j < s2.length() && s2.charAt(j) == s3.charAt(k) && dfs(s1, s2, s3, i, j + 1, k + 1);
        boolean reached = path1 || path2;
        if (!reached) invalid[i][j] = true;

        return reached;
    }
}
