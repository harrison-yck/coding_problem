import java.util.HashMap;
import java.util.Map;
import java.util.Stack;


/**
 * @author harrison
 */

/*
    895. Maximum Frequency Stack
*/


public class MaximumFrequencyStack {
    private final Map<Integer, Integer> frequency = new HashMap<>();    // store pushed number as key, freq as value
    private final Map<Integer, Stack<Integer>> order = new HashMap<>(); // store freq as key, inserted numbers as value
    private int maxFreq = 0;

    public void push(int x) {
        int freq = frequency.getOrDefault(x, 0) + 1;
        maxFreq = Math.max(maxFreq, freq);
        frequency.put(x, freq);

        Stack<Integer> orderStack = order.getOrDefault(freq, new Stack<>());
        orderStack.push(x);
        order.put(freq, orderStack);
    }

    public int pop() {
        Integer numberToPop = order.get(maxFreq).pop();
        frequency.put(numberToPop, maxFreq - 1);
        if (order.get(maxFreq).size() == 0) maxFreq--;
        return numberToPop;
    }
}
