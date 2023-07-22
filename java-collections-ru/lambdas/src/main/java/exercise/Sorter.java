package exercise;

import java.util.Comparator;
import java.util.Map;
import java.util.List;

// BEGIN
class Sorter {
    public static List<String> takeOldestMans(List<Map<String, String>> users) {
        return users.stream().sorted(Comparator.comparing(o -> o.get("birthday")))
                .filter(el -> el.get("gender").equals("male"))
                .map(el -> el.get("name")).toList();
    }
}
// END
