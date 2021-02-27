import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author harrison
 */

/*
   946. Validate Stack Sequences
*/

public class ValidateStackSequences {
//    public static boolean solve(int[] pushed, int[] popped) {
//        Deque<Integer> deque = new ArrayDeque<>();
//
//        int pop = 0;
//        for (int number: pushed) {
//            if (number != popped[pop]) deque.push(number);
//            else pop++;
//
//            while (!deque.isEmpty() && deque.peek() == popped[pop]) {
//                deque.pop();
//                pop++;
//            }
//        }
//
//        while (!deque.isEmpty()) {
//            if (deque.pop() != popped[pop++]) return false;
//        }
//
//        return true;
//    }

    public static boolean solve(int[] pushed, int[] popped) {
        int i = 0, j = 0;
        for (int x : pushed) {
            pushed[i++] = x;
            while (i > 0 && pushed[i - 1] == popped[j]) {
                --i; ++j;
            }
        }
        return i == 0;
    }
}
