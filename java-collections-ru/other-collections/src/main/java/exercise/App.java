package exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

// BEGIN
class App {
    public static LinkedHashMap<String, String> genDiff(Map<String, Object> data1, Map<String, Object> data2) {
        var diffMap = new LinkedHashMap<String, String>();
        var deletedKeys = data1.keySet().stream().filter(val -> !data2.containsKey(val)).toList();
        deletedKeys.forEach(val -> diffMap.put(val, "deleted"));
        var addedKeys = data2.keySet().stream().filter(val -> !data1.containsKey(val)).toList();
        addedKeys.forEach(val -> diffMap.put(val, "added"));
        var bothHasKeys = data1.keySet().stream().filter(data2::containsKey).toList();
        bothHasKeys.forEach(key -> {
            if (data1.get(key).equals(data2.get(key)) ) {
                diffMap.put(key, "unchanged");
            } else {
                diffMap.put(key, "changed");
            }
        });
        return diffMap;
    }
}
//END
