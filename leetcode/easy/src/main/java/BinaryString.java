/**
 * @author harrison
 */

/*
* 5697. Check if Binary String Has at Most One Segment of Ones
* */
public class BinaryString {
    public boolean checkOnesSegment(String s) {
        char prev = '1';
        boolean disCon = false;

        for (int i = 0; i < s.length(); i++) {
            if (disCon && s.charAt(i) == '1') return false;
            if (prev == '1' && s.charAt(i) == '0') disCon = true;
            prev = s.charAt(i);
        }
        return true;
    }
}
