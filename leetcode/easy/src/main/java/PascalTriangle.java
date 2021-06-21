import java.util.ArrayList;
import java.util.List;

/**
 * @author harrison
 */
public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        List<Integer> previousLayer = null;
        for (int i = 0; i < numRows; i++) {
            List<Integer> layer = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) layer.add(1);
                else layer.add(previousLayer.get(j - 1) + previousLayer.get(j));
            }

            result.add(layer);
            previousLayer = layer;
        }
        return result;
    }
}
