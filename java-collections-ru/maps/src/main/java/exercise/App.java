package exercise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// BEGIN
class App {

    public static Map<String, Integer> getWordCount(String sentence) {
        var counter = new HashMap<String, Integer>();
        var words = Arrays.stream(sentence.split(" ")).toList();
        for (var word : words) {
            if (word.equals("")) {
                continue;
            }
            var num = counter.getOrDefault(word, 0);
            counter.put(word, num + 1);
        }
        return counter;
    }

    public static String toString(Map<String, Integer> counter) {
        var builder = new StringBuilder();
        builder.append("{");
        if (!counter.isEmpty()) {
            builder.append("\n");
        }
        for (var key : counter.keySet()) {
            builder.append("  ").append(key).append(": ").append(counter.get(key)).append("\n");
        }
        builder.append("}");
        return builder.toString();
    }
}
//END
