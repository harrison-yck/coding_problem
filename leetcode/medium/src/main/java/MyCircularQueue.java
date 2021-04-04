import java.util.ArrayList;
import java.util.List;

/**
 * @author harrison
 */

// 622. Design Circular Queue

public class MyCircularQueue {
    private final List<Integer> queue;
    private int size;
    private final int maxSize;

    public MyCircularQueue(int k) {
        queue = new ArrayList<>();
        maxSize = k;
    }

    public boolean enQueue(int value) {
        if (isFull()) return false;

        queue.add(value);
        size++;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) return false;

        queue.remove(0);
        size--;
        return true;
    }

    public int Front() {
        if (isEmpty()) return -1;
        return queue.get(0);
    }

    public int Rear() {
        if (isEmpty()) return -1;
        return queue.get(size - 1);
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == maxSize;
    }
}
