import java.util.ArrayList;
import java.util.List;

/**
 * @author harrison
 */
public class PalindromePairs {
    // TLE
//    public static List<List<Integer>> palindromePairs(String[] words) {
//        List<List<Integer>> result = new ArrayList<>();
//
//        Map<String, Boolean> palindromes = new HashMap<>();
//        for (int i = 0; i < words.length; i++) {
//            for (int j = 0; j < words.length; j++) {
//                if (i == j) continue;
//                String s = words[i] + words[j]; // slow here
//
//                if (palindromes.containsKey(s)) {
//                    if (palindromes.get(s) == Boolean.TRUE) result.add(List.of(i, j));
//                } else if (isReversedPair(words[i], words[j])) {
//                    result.add(List.of(i, j));
//                    palindromes.put(s, Boolean.TRUE);
//                } else {
//                    boolean isPalindrome = isPalindrome(s);
//
//                    if (isPalindrome) result.add(List.of(i, j));
//                    palindromes.put(s, isPalindrome);
//                }
//            }
//        }
//        return result;
//    }
//
//    private static boolean isReversedPair(String a, String b) {
//        StringBuilder sb = new StringBuilder(a);
//        String reveredA = sb.reverse().toString();
//        return reveredA.equals(b);
//    }
//
//    private static boolean isPalindrome(String s) {
//        int start = 0, end = s.length() - 1;
//        while (start < end) {
//            if (s.charAt(start) != s.charAt(end)) return false;
//            start++;
//            end--;
//        }
//        return true;
//    }

    public static List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> result = new ArrayList<>();
        TrieNode root = new TrieNode();

        for (int i = 0; i < words.length; i++) {
            addToTrie(root, words[i], i);
        }

        for (int i = 0; i < words.length; i++) {
            searchResult(words, i, root, result);
        }

        return result;
    }

    private static void addToTrie(TrieNode node, String word, Integer index) {
        for (int i = word.length() - 1; i >= 0; i--) {
            int nextIndex = word.charAt(i) - 'a';

            if (node.next[nextIndex] == null) node.next[nextIndex] = new TrieNode();
            if (isPalindrome(word, 0, i)) node.list.add(index);

            node = node.next[nextIndex];
        }

        node.list.add(index);
        node.index = index;
    }

    private static void searchResult(String[] words, int i, TrieNode root, List<List<Integer>> result) {
        for (int j = 0; j < words[i].length(); j++) {
            if (root.index >= 0 && root.index != i && isPalindrome(words[i], j, words[i].length() - 1)) {
                result.add(List.of(i, root.index));
            }

            root =  root.next[words[i].charAt(j) - 'a'];
            if (root == null) return; // this is leaf node
        }

        for (int j : root.list) {
            if (i == j) continue;
            result.add(List.of(i, j));
        }
    }

    private static boolean isPalindrome(String s, int start, int end) {
        while (start < end) if (s.charAt(start++) != s.charAt(end--)) return false;
        return true;
    }

    private static class TrieNode {
        int index = -1;
        TrieNode[] next = new TrieNode[26];
        List<Integer> list = new ArrayList<>(); // store indices of palindrome with this node
    }
}
