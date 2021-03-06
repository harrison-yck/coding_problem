import datastructure.TrieNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author harrison
 */

/*
*    820. Short Encoding of Words
*/
public class ShortEncodingOfWords {
    public static int trieSolution(String[] words) {
        // ref: https://leetcode.com/problems/short-encoding-of-words/discuss/125784/Trie-Solution
        List<TrieNode> leaves = new ArrayList<>();

        TrieNode root = new TrieNode();
        for (String word: new HashSet<>(Arrays.asList(words))) { // avoid duplicate checking
            TrieNode current = root; // traversal from root for every single word

            for (int i = word.length() - 1; i >= 0; i--) { // reverse order since the requirement is according to suffix instead of prefix
                char c = word.charAt(i);
                if (!current.next.containsKey(c)) current.next.put(c, new TrieNode()); // new character add node for it
                current = current.next.get(c);
            }
            current.depth = word.length() + 1; // +1 for #
            leaves.add(current); // reach first character of the word
        }

        int res = 0;
        for (TrieNode leaf : leaves) if (leaf.next.isEmpty()) res += leaf.depth;
        return res;
    }

    /*
    *   Although this solution is faster, it is not preferred.
    *   Company wish to test your skill on tree traversal instead of in-built string function
    */
    public static int removeSubstringSolution(String[] words) {
        // ref: https://leetcode.com/problems/short-encoding-of-words/discuss/125811/C%2B%2BJavaPython-Easy-Understood-Solution-with-Explanation
        Set<String> s = new HashSet<>(Arrays.asList(words)); // avoid duplicate checking
        for (String word : words) for (int i = 1; i < word.length(); ++i) s.remove(word.substring(i));

        int res = 0;
        for (String word : s) res += word.length() + 1;
        return res;
    }
}
