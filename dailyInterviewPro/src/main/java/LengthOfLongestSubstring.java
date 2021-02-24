/**
 * @author harrison
 */

/*
    Given a string, find the length of the longest substring without repeating characters.

    Example:
    Input: 'abrkaabcdefghijjxxx'
    Output: 10
 */

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstring {
    static int solve(String s) {
        Map<Character, Integer> map = new HashMap<>();

        int longest = 0;
        int offset = 0;
        int length = s.length();

        for (int i = 0; i < length; i++) {
            if (map.containsKey(s.charAt(i))) offset = Math.max(offset, map.get(s.charAt(i)) + 1);

            map.put(s.charAt(i), i);
            longest = Math.max(longest, i - offset + 1);
        }

        return longest;
    }
}
