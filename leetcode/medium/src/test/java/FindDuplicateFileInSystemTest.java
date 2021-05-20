import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FindDuplicateFileInSystemTest {

    @Test
    void findDuplicate() {
        FindDuplicateFileInSystem findDuplicateFileInSystem = new FindDuplicateFileInSystem();
        assertThat(findDuplicateFileInSystem.findDuplicate(new String[]{"root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)", "root/c/d 4.txt(efgh)", "root 4.txt(efgh)"})).containsAll(List.of(List.of("root/a/2.txt","root/c/d/4.txt","root/4.txt"), List.of("root/a/1.txt","root/c/3.txt")));
        assertThat(findDuplicateFileInSystem.findDuplicate(new String[]{"root/a 1.txt(abcd) 2.txt(efgh)","root/c 3.txt(abcd)","root/c/d 4.txt(efgh)"})).containsAll(List.of(List.of("root/a/2.txt","root/c/d/4.txt"), List.of("root/a/1.txt","root/c/3.txt")));
    }
}
