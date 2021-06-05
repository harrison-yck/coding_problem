import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author harrison
 */
public class OpenTheLock {
    public int openLock(String[] deadends, String target) {
        // bidirectional bfs
        // ref: https://www.geeksforgeeks.org/bidirectional-search/

        // when to use:
        // 1. Both initial and goal states are unique and completely defined.
        // 2. The branching factor is exactly the same in both directions.

        Set<Integer> beginSet = new HashSet<>();
        Set<Integer> endSet = new HashSet<>();
        Set<Integer> deadSet = Arrays.stream(deadends).map(Integer::parseInt).collect(Collectors.toSet());

        if (deadSet.contains(0)) return -1; // dead end in the beginning

        beginSet.add(0);
        endSet.add(Integer.parseInt(target));

        int cost = 0;
        Set<Integer> tmpSet;
        while (!beginSet.isEmpty() && !endSet.isEmpty()) {
            // we use begin to search, when beginSet is larger -> swap
            if (beginSet.size() > endSet.size()) {
                tmpSet = beginSet;
                beginSet = endSet;
                endSet = tmpSet;
            }

            tmpSet = new HashSet<>();
            for (Integer combination : beginSet) {
                if (deadSet.contains(combination)) continue;
                if (endSet.contains(combination)) return cost;

                deadSet.add(combination);

                for (int i = 0; i < 4; i++) {
                    // This escape from String / char handling, much faster
                    int denom = 1;
                    for (int j = 0; j < i; j++) {
                        denom *= 10;
                    }
                    int digit = (combination / denom) % 10;
                    if (digit == 0) {
                        tmpSet.add(combination + 9 * denom);
                        tmpSet.add(combination + denom);
                    } else if (digit == 9) {
                        tmpSet.add(combination - 9 * denom);
                        tmpSet.add(combination - denom);
                    } else {
                        tmpSet.add(combination + denom);
                        tmpSet.add(combination - denom);
                    }
                }
            }
            cost++;
            beginSet = tmpSet;
        }
        return -1;
    }
}

//    private void bfs(char[] slots, int cost, Set<char[]> deadSet) {
//        if (slots == UNLOCKED) minCost = Math.min(minCost, cost);
//        if (minCost != Integer.MAX_VALUE && cost >= minCost || deadSet.contains(slots)) return;
//
//        deadSet.add(slots);
//        for (int i = 0; i < 4; i++) {
//            char decr = slots[i] == '0' ? '9' : (char) (slots[i] - 1);
//            char incr = slots[i] == '9' ? '0' : (char) (slots[i] + 1);
//
//            char[] tmp = slots.clone();
//            tmp[i] = incr;
//            bfs(tmp, cost + 1, deadSet);
//
//            tmp[i] = decr;
//            bfs(tmp, cost + 1, deadSet);
//        }
//    }
