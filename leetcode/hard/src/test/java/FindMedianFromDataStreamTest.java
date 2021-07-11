import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindMedianFromDataStreamTest {
    private FindMedianFromDataStream findMedianFromDataStream;

    @BeforeEach
    void init() {
        findMedianFromDataStream = new FindMedianFromDataStream();
    }

    @Test
    void test1() {
        findMedianFromDataStream.addNum(1);
        findMedianFromDataStream.addNum(2);
        findMedianFromDataStream.addNum(3);
        assertThat(findMedianFromDataStream.findMedian()).isEqualTo(2.0);
    }

    @Test
    void test2() {
        findMedianFromDataStream.addNum(-1);
        findMedianFromDataStream.addNum(-2);
        findMedianFromDataStream.addNum(-3);
        findMedianFromDataStream.addNum(-4);
        assertThat(findMedianFromDataStream.findMedian()).isEqualTo(-2.50000);
    }

    @Test
    void test3() {
        findMedianFromDataStream.addNum(-1);
        findMedianFromDataStream.addNum(-2);
        findMedianFromDataStream.addNum(-3);
        findMedianFromDataStream.addNum(-4);
        findMedianFromDataStream.addNum(-5);
        assertThat(findMedianFromDataStream.findMedian()).isEqualTo(-3.00000);
    }

    @Test
    void test4() {
        findMedianFromDataStream.addNum(-1);
        findMedianFromDataStream.addNum(-2);
        findMedianFromDataStream.addNum(-3);
        findMedianFromDataStream.addNum(-4);
        findMedianFromDataStream.findMedian();
        findMedianFromDataStream.addNum(-5);
        assertThat(findMedianFromDataStream.findMedian()).isEqualTo(-3.00000);
    }
}
