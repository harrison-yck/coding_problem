import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * @author harrison
 */
public class AdvantageShuffle {
    public static int[] treeAdvantageCount(int[] A, int[] B) {
        TreeMap<Integer, Integer> occurrence = new TreeMap<>();

        for (int number : A) {
            occurrence.merge(number, 1, Integer::sum); // count occurrence
        }

        int index = 0;
        int[] result = new int[A.length];

        for (int number : B) {
            Map.Entry<Integer, Integer> entry = occurrence.higherEntry(number); // get larger entry
            if (entry == null) entry = occurrence.firstEntry(); // else get first entry

            result[index] = entry.getKey();

            int count = entry.getValue() - 1;
            if (count <= 0) {
                occurrence.remove(entry.getKey()); // no left
            } else {
                occurrence.put(entry.getKey(), count);
            }
            index++;
        }

        return result;
    }
}
