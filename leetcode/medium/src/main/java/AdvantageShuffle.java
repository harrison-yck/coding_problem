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

    public static int[] advantageCount(int[] A, int[] B) {
        int aLength = A.length;
        Arrays.sort(A);

        Integer[] bSortedIndex = new Integer[aLength];
        for (int i = 0; i < aLength; i++) bSortedIndex[i] = i;
        Arrays.sort(bSortedIndex, (a, b) -> B[b] - B[a]); // sort desc

        int smaller = 0, larger = aLength - 1;
        int[] result = new int[aLength];

        for (Integer index: bSortedIndex) {
            if (A[larger] > B[index]) {
                result[index] = A[larger--];
            } else {
                result[index] = A[smaller++];
            }
        }
        return result;
    }
}
