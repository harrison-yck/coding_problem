/**
 * @author harrison
 */

/*
    1306. Jump Game III
*/

public class JumpGameThree {
//    static boolean[] VISITED;
//
//    static boolean canReach(int[] arr, int start) {
//        VISITED = new boolean[arr.length];
//        return traversal(arr, start);
//    }
//
//    static boolean traversal(int[] arr, int index) {
//        if (index < 0 || index >= arr.length) return false;
//
//        if (arr[index] == 0) {
//            return true;
//        } else if (VISITED[index]) { // visited -> reach again -> loop
//            return false;
//        }
//
//        VISITED[index] = true;
//
//        return traversal(arr, index + arr[index]) || traversal(arr, index - arr[index]);
//    }


    // Better approach -> use -1 to represent visited
    static boolean canReach(int[] arr, int start) {
        return traversal(arr, start);
    }

    static boolean traversal(int[] arr, int index) {
        if (index < 0 || index >= arr.length) return false;

        if (arr[index] == 0) {
            return true;
        } else if (arr[index] == -1) { // visited -> reach again -> loop
            return false;
        }

        int steppedInt = arr[index];
        arr[index] = -1;

        return traversal(arr, index + steppedInt) || traversal(arr, index - steppedInt);
    }
}
