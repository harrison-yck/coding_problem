import java.util.ArrayList;
import java.util.List;

/**
 * @author harrison
 */
public class StampingTheSequence {
    //
    public int[] movesToStamp(String stamp, String target) {
        int targetLength = target.length();
        int stampLength = stamp.length();
        char[] stampArr = stamp.toCharArray();
        char[] targetArr = target.toCharArray();

        int replaced = 0;
        boolean[] visited = new boolean[targetLength];
        List<Integer> result = new ArrayList<>();

        outer:
        while (true) {
            boolean updateAny = false;
            // valid solution should update something for every traversal
            for (int i = 0; i <= targetLength - stampLength; i++) {
                // use visited to avoid checking already replaced range
                if (!visited[i] && canReplace(targetArr, stampArr, i)) {
                    result.add(i);
                    replaced += replace(targetArr, stampArr, i);
                    visited[i] = true;
                    updateAny = true;

                    if (replaced == targetLength) break outer; // find valid solution
                }
            }

            if (!updateAny) return new int[0]; // no solution
        }

        // I used ArrayDeque originally. But use list and then change to array is faster (7ms -> 3ms)
        int[] res = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            res[i] = result.get(result.size() - i - 1);
        }

        return res;
    }

    private boolean canReplace(char[] targetArr, char[] stampArr, int i) {
        for (int stampIndex = 0; stampIndex < stampArr.length; stampIndex++) {
            if (targetArr[stampIndex + i] != '?' && targetArr[stampIndex + i] != stampArr[stampIndex]) return false; // match stamp pattern / wildcard
        }
        return true;
    }

    private int replace(char[] currentArr, char[] stampArr, int index) {
        int replaceCount = 0;
        for (int i = index, stampIndex = 0; i < index + stampArr.length; i++, stampIndex++) {
            if (currentArr[i] != '?') {
                currentArr[i] = '?';
                replaceCount++;
            }
        }
        return replaceCount;
    }
}
