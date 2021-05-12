import java.util.*;

/**
 * @author harrison
 */
public class LongestSubstringWithoutDuplicates {
    public int set(String s) {
        if (s.length() < 2) return s.length();

        int max = 0;
        Set<Character> dup = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            dup.clear();
            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);
                if (dup.contains(c)) {
                    break;
                } else {
                    dup.add(c);
                }
            }
            max = Math.max(max, dup.size());
        }
        return max;
    }

    public int map(String s) {
        if (s.length() < 2) return s.length();

        Map<Character, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        int max = 1, leftMost = 0;
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (map.containsKey(c)) {
                if (map.get(c) >= leftMost) leftMost = map.get(c) + 1;
            }
            map.put(c, i);
            max = Math.max(i - leftMost + 1, max);
        }
        return max;
    }

    public int array(String s) {
        if (s.length() < 2) return s.length();

        char[] chars = s.toCharArray();
        int[] arr = new int[128];
        Arrays.fill(arr, -1);

        int max = 1, leftMost = 0;
        for (int i = 0; i < chars.length; i++) {
            int index = arr[chars[i]];
            arr[chars[i]] = i;

            if (index >= leftMost) leftMost = index + 1;
            max = Math.max(i - leftMost + 1, max);

            if(chars.length - leftMost <= max) return max;
        }
        return max;
    }
}
