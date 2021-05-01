import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author harrison
 */
public class WordFilter {
    // slow when lots of word in word list
//    Map<String, Integer> map = new HashMap<>();
//
//    public WordFilter(String[] words) {
//        for (int index = 0; index < words.length; index++) {
//            String word = words[index];
//            int length = word.length();
//
//            for (int i = 0; i <= length; i++) {
//                for (int j = 0; j <= length; j++) {
//                    String s = word.substring(0, i) + "#" + word.substring(length - j);
//                    map.put(s, index);
//                }
//            }
//        }
//    }
//
//    public int f(String prefix, String suffix) {
//        return map.getOrDefault(prefix + "#" + suffix, -1);
//    }

    Trie trie;

    public WordFilter(String[] words) {
        trie = new Trie();
        for (int i = 0; i < words.length; i++) trie.add(words[i], i);
    }

    public int f(String prefix, String suffix) {
        List<Integer> left = trie.startWith(prefix);
        List<Integer> right = trie.endWith(suffix);

        int leftIndex = left.size() - 1;
        int rightIndex = right.size() - 1;

        while(leftIndex >= 0 && rightIndex >= 0) {
            int a = left.get(leftIndex);
            int b = right.get(rightIndex);

            if(a > b) {
                leftIndex--;
            } else if(a < b) {
                rightIndex--;
            } else {
                return a;
            }
        }
        return -1;
    }

    static class Trie {
        TrieNode root;
        TrieNode reversedRoot;

        public Trie() {
            root = new TrieNode();
            reversedRoot = new TrieNode();
        }

        public void add(String word, int index) {
            add(word, index, true);
            add(word, index, false);
        }

        private void add(String word, int index, boolean reversed) {
            TrieNode node = reversed ? reversedRoot : root;

            for(int i = 0; i < word.length(); i++) {
                char c = reversed ? word.charAt(word.length() - i - 1) : word.charAt(i);
                if(node.children[c - 'a'] == null) {
                    node.children[c - 'a'] = new TrieNode();
                }
                node = node.children[c - 'a'];
                node.indices.add(index);
            }
        }

        public List<Integer> startWith(String prefix) {
            return search(prefix, false);
        }

        public List<Integer> endWith(String suffix) {
            return search(suffix, true);
        }

        private List<Integer> search(String word, boolean reversed) {
            TrieNode cur = reversed ? reversedRoot : root;

            for(int i = 0; i < word.length(); i++) {
                char c = reversed ? word.charAt(word.length() - i - 1) : word.charAt(i);
                if(cur.children[c - 'a'] == null) {
                    return new ArrayList<>();
                }
                cur = cur.children[c - 'a'];
            }
            return cur.indices;
        }
    }

    static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        List<Integer> indices = new ArrayList<>();
    }
}
