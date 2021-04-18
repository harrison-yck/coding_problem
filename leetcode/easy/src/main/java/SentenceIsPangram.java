/**
 * @author harrison
 */
public class SentenceIsPangram {
    public boolean checkIfPangram(String sentence) {
        boolean[] count = new boolean[26];

        for (char c: sentence.toCharArray()) count[c - 'a'] = true;

        boolean isPangram = true;
        for(int i = 0; i < 26; i++) isPangram &= count[i];
        return isPangram;
    }
}
