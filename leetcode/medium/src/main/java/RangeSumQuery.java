/**
 * @author harrison
 */
public class RangeSumQuery {
    int[] nums;
    int[] binaryIndex;
    int size;

    public RangeSumQuery(int[] nums) {
        this.nums = nums;
        size = nums.length;
        binaryIndex = new int[size + 1];
        for (int i = 0; i < size; i++) {
            setNode(i, nums[i]);
        }
    }

    public void setNode(int index, int val) {
        index++;
        while (index <= size) {
            binaryIndex[index] += val;
            index += (index & -index);
        }
    }

    void update(int i, int val) {
        int diff = val - nums[i];
        nums[i] = val;
        setNode(i, diff);
    }

    public int getSum(int i) {
        int sum = 0;
        i++;
        while (i > 0) {
            sum += binaryIndex[i];
            i -= (i & -i);
        }
        return sum;
    }

    public int sumRange(int i, int j) {
        return getSum(j) - getSum(i - 1);
    }
}
