import java.util.Collections;
import java.util.PriorityQueue;

/**
 * @author harrison
 */
public class FindMedianFromDataStream {
    private final PriorityQueue<Integer> firstHalf;
    private final PriorityQueue<Integer> lastHalf;

    public FindMedianFromDataStream() {
        lastHalf = new PriorityQueue<>();
        firstHalf = new PriorityQueue<>(Collections.reverseOrder());
    }

    public void addNum(int num) {
        // handle here instead of handling in findMedian
        lastHalf.offer(num);
        firstHalf.offer(lastHalf.poll());

        if (lastHalf.size() < firstHalf.size()) {
            lastHalf.offer(firstHalf.poll());
        }
    }

    public double findMedian() {
        if (lastHalf.size() == firstHalf.size()){
            return (double) (lastHalf.peek() + firstHalf.peek()) / 2.0;
        } else {
            return lastHalf.peek(); // check last half since we add to last half first and move to first half if imbalanced
        }
    }
}
