package datastructure;

import java.util.HashMap;
import java.util.Map;

/**
 * @author harrison
 */
public class TrieNode {
    public Map<Character, TrieNode> next = new HashMap<>();
    public int depth;
}
