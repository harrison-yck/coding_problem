
/**
 * @author harrison
 */
public class IsomorphicStrings {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add"));
        System.out.println(isIsomorphic("badc", "baba"));
        System.out.println(isIsomorphic("qwertyuiop[]asdfghjkl;'\\\\zxcvbnm,./", "',.pyfgcrl/=aoeuidhtns-\\\\;qjkxbmwvz"));
    }

    public static boolean isIsomorphic(String s, String t) {
        final int[] map1 = new int[257];
        final int[] map2 = new int[257];

        char[] chars1 = s.toCharArray();
        char[] chars2 = t.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            char c1 = (char) (chars1[i] + 1);
            char c2 = (char) (chars2[i] + 1);

            if (map1[c1] == 0 && map2[c2] == 0) {
                map1[c1] = c2;
                map2[c2] = c1;
            } else if (map1[c1] != c2 || map2[c2] != c1) {
                return false;
            }
        }
        return true;
    }
}
