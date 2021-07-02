import java.util.ArrayList;
import java.util.List;

/**
 * @author harrison
 */
public class FindKClosestElements {
    public static void main(String[] args) {
        FindKClosestElements findKClosestElements = new FindKClosestElements();
        System.out.println(findKClosestElements.findClosestElements(new int[]{1, 2, 3, 4, 5}, 4, 3));
        System.out.println(findKClosestElements.findClosestElements(new int[]{1, 2, 3, 4, 5}, 4, -1));
    }

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int left = 0, right = arr.length - k;

        // try to find out the starting left
        while (left < right) {
            int mid = left + (right - left) / 2;


            if (x - arr[mid] > arr[mid + k] - x) {
                left = mid + 1; // right is closer
            } else {
                right = mid; // mid is closer
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = left; i < left + k; i++) {
            result.add(arr[i]);
        }

        return result;
    }
}
