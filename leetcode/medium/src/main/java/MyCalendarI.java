import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * @author harrison
 */
public class MyCalendarI {
    private final TreeMap<Integer, Integer> map;

    public MyCalendarI() {
        map = new TreeMap<>();
    }

    public boolean book(int start, int end) {
        if (end <= start) return false;

        Map.Entry<Integer, Integer> right = map.lowerEntry(end);
        if (right != null && right.getValue() > start) return false;

        map.put(start, end);
        return true;
    }
}
