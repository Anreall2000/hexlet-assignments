package exercise;

import java.util.stream.Collectors;
import java.util.Arrays;

// BEGIN
class App {
    public static String getForwardedVariables(String str) {
        return Arrays.stream(str.split("\n"))
                .filter(line -> line.startsWith("environment"))
                .map(line -> {
                    var start = line.indexOf("=\"");
                    var end = line.length() - 1;
                    return  line.substring(start + 2, end);
                }).flatMap(line -> Arrays.stream(line.split(",")))
                .filter(s -> s.startsWith("X_FORWARDED_"))
                .map(s -> s.substring("X_FORWARDED_".length()))
                .collect(Collectors.joining(","));
    }
}
//END
