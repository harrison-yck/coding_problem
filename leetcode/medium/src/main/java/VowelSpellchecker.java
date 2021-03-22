import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author harrison
 */
public class VowelSpellchecker {
    /*
    *  use prefix tree for searching would be much more faster in this question
    */
    public static String[] spellchecker(String[] wordlist, String[] queries) {
        Set<String> vowels = Set.of("a", "e", "i", "o", "u");

        Set<String> perfectHash = new HashSet<>();
        HashMap<String, Integer> lowerHash = new HashMap<>();
        HashMap<String, Integer> vowelHash = new HashMap<>();

        for (int i = 0; i < wordlist.length; i++) {
            String s = wordlist[i];
            String lower = s.toLowerCase();
            String removeVowel = lower;

            for (String vowel : vowels) removeVowel = removeVowel.replace(vowel, "*");

            perfectHash.add(s);
            vowelHash.putIfAbsent(removeVowel, i);
            lowerHash.putIfAbsent(lower, i);
        }

        String[] outputs = new String[queries.length];
        for (int i = 0; i < queries.length; i++) {
            if (perfectHash.contains(queries[i])) {
                outputs[i] = queries[i];
                continue;
            }

            String lower = queries[i].toLowerCase();
            String removeVowel = lower;
            for (String vowel : vowels) {
                removeVowel = removeVowel.replace(vowel, "*");
            }

            if (lowerHash.containsKey(lower)) {
                outputs[i] = wordlist[lowerHash.get(lower)];
                continue;
            }

            if (vowelHash.containsKey(removeVowel)) {
                outputs[i] = wordlist[vowelHash.get(removeVowel)];
                continue;
            }

            outputs[i] = "";
        }

        return outputs;
    }
}
