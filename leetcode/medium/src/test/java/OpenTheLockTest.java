import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class OpenTheLockTest {

    @Test
    void openLock() {
        OpenTheLock openTheLock = new OpenTheLock();
        assertThat(openTheLock.openLock(new String[]{"0201","0101","0102","1212","2002"}, "0202")).isEqualTo(6);
        assertThat(openTheLock.openLock(new String[]{"8888"}, "0009")).isEqualTo(1);
        assertThat(openTheLock.openLock(new String[]{"5557","5553","5575","5535","5755","5355","7555","3555","6655","6455","4655","4455","5665","5445","5645","5465","5566","5544","5564","5546","6565","4545","6545","4565","5656","5454","5654","5456","6556","4554","4556","6554"}, "5555")).isEqualTo(-1);
    }
}