import datastructure.NestedInteger;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author harrison
 */

public class FlattenNestedListIterator implements Iterator<Integer> {
    private final List<Integer> flattedList;
    private final int last;
    private int cursor = 0;

    public FlattenNestedListIterator(List<NestedInteger> nestedList) {
        flattedList = new ArrayList<>();
        flatted(nestedList);
        last = flattedList.size() - 1;
    }

    private void flatted(List<NestedInteger> nestIntegers) {
        for (NestedInteger nestedInteger : nestIntegers) {
            if (nestedInteger.isInteger()) flattedList.add(nestedInteger.getInteger());
            else flatted(nestedInteger.getList());
        }
    }

    @Override
    public Integer next() {
        return flattedList.get(cursor++);
    }

    @Override
    public boolean hasNext() {
        return cursor <= last;
    }
}
