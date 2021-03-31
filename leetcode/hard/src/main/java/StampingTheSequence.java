import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/**
 * @author harrison
 */
public class StampingTheSequence {
    static Deque<Integer> result = new ArrayDeque<>();

    public static int[] movesToStamp(String stamp, String target) {
        char[] stampArr = stamp.toCharArray();
        char[] targetArr = target.toCharArray();

        int numOfReplacedChar = 0;

        while (target.length() != numOfReplacedChar) {
            int index = target.indexOf(stamp);
            result.push(index);
            replace(targetArr, stampArr, index);
            if (index == -1) break;
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    private static void replace(char[] currentArr, char[] stampArr, int index) {
        for (int i = index, stampIndex = 0; i < index + stampArr.length; i++, stampIndex++) {
            currentArr[i] = '*';
        }
    }

    private static boolean canReplace(char[] currentArr, char[] stampArr, int index) {
        int replaceTo = index + stampArr.length;

        for (int replaceFrom = index; replaceFrom <= replaceTo; replaceFrom++) {

        }

        return false;
    }
}
