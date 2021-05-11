import java.util.*;

/**
 * @author harrison
 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] count = new char[26];
            for (char c : s.toCharArray()) count[c - 'a']++;

            String key = String.valueOf(count);
            List<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(s);
            map.put(key, list);
        }
        return new ArrayList<>(map.values());
    }
}
