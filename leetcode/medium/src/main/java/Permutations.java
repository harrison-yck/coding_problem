import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author harrison
 */
public class Permutations {
    List<List<Integer>> results;

    public List<List<Integer>> permute(int[] nums) {
        results = new ArrayList<>();
        backtrack(new ArrayList<>(), nums);
        return results;
    }

    private void backtrack(List<Integer> path, int[] selections) {
        if (path.size() == selections.length) {
            results.add(new ArrayList<>(path));
            return;
        }

        for (int selection: selections) {
            if (path.contains(selection)) continue;

            path.add(selection);
            backtrack(path, selections);
            path.remove(path.size() - 1);
        }
    }
}
