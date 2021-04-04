import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MyCircularQueueTest {
    @Test
    void test1() {
        MyCircularQueue myCircularQueue = new MyCircularQueue(3);
        assertThat(myCircularQueue.enQueue(1)).isTrue();
        assertThat(myCircularQueue.enQueue(2)).isTrue();
        assertThat(myCircularQueue.enQueue(3)).isTrue();
        assertThat(myCircularQueue.enQueue(4)).isFalse();
        assertThat(myCircularQueue.Rear()).isEqualTo(3);
        assertThat(myCircularQueue.isFull()).isTrue();
        assertThat(myCircularQueue.deQueue()).isTrue();
        assertThat(myCircularQueue.enQueue(4)).isTrue();
        assertThat(myCircularQueue.Rear()).isEqualTo(4);
    }

    @Test
    void test2() {
        MyCircularQueue myCircularQueue = new MyCircularQueue(8);
        assertThat(myCircularQueue.enQueue(3)).isTrue();
        assertThat(myCircularQueue.enQueue(9)).isTrue();
        assertThat(myCircularQueue.enQueue(5)).isTrue();
        assertThat(myCircularQueue.enQueue(0)).isTrue();
        assertThat(myCircularQueue.deQueue()).isTrue();
        assertThat(myCircularQueue.deQueue()).isTrue();
        assertThat(myCircularQueue.isEmpty()).isFalse();
        assertThat(myCircularQueue.isEmpty()).isFalse();
        assertThat(myCircularQueue.Rear()).isEqualTo(0);
        assertThat(myCircularQueue.Rear()).isEqualTo(0);
        assertThat(myCircularQueue.deQueue()).isTrue();
    }
}
