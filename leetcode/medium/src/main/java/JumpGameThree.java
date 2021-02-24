/**
 * @author harrison
 */

/*
    1306. Jump Game III

    Given an array of non-negative integers arr, you are initially positioned at start index of the array.
    When you are at index i, you can jump to i + arr[i] or i - arr[i], check if you can reach to any index with value 0.

    Notice that you can not jump outside of the array at any time.
*/

public class JumpGameThree {
    static boolean[] VISITED;

    static boolean canReach(int[] arr, int start) {
        VISITED = new boolean[arr.length];
        return traversal(arr, start);
    }

    static boolean traversal(int[] arr, int index) {
        if (index < 0 || index >= arr.length) return false;

        if (arr[index] == 0) {
            return true;
        } else if (VISITED[index]) { // visited -> reach again -> loop
            return false;
        }

        VISITED[index] = true;

        return traversal(arr, index + arr[index]) || traversal(arr, index - arr[index]);
    }
}
