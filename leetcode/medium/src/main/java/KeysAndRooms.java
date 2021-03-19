import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * @author harrison
 */
public class KeysAndRooms {
    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] roomVisited = new boolean[rooms.size()];
        roomVisited[0] = true;

        Stack<Integer> stack = new Stack<>();
        stack.addAll(rooms.get(0));

        while (!stack.isEmpty()) {
            Integer roomNum = stack.pop();

            if (!roomVisited[roomNum]) {
                stack.addAll(rooms.get(roomNum));
                roomVisited[roomNum] = true;
            }
        }

        for (boolean visited : roomVisited) {
            if (!visited) return false;
        }

        return true;
    }
}
