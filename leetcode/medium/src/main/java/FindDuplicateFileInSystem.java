import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author harrison
 */
public class FindDuplicateFileInSystem {
    public List<List<String>> findDuplicate(String[] paths) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : paths) {
            String[] strings = s.split(" ");

            if (strings.length == 1) continue;
            for (int i = 1; i < strings.length; i++) {
                String[] segment = strings[i].split("\\(");
                String path = strings[0] + "/" + segment[0];
                String filename = segment[1].substring(0, segment[1].length() - 1);

                List<String> list = map.getOrDefault(filename, new ArrayList<>());
                list.add(path);
                map.put(filename, list);
            }
        }
        return map.values().stream().filter(entry -> entry.size() > 1).collect(Collectors.toList());
    }
}
