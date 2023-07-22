package exercise;

import java.util.Arrays;

// BEGIN
class App {
    public static String[][] enlargeArrayImage(String[][] image) {
        return Arrays.stream(image)
                .map(row -> Arrays.stream(row)
                        .map(el -> new String[] {el, el})
                        .flatMap(Arrays::stream).toArray(String[]::new))
                .map(row -> new String[][] {row, row})
                .flatMap(Arrays::stream).toArray(String[][]::new);
    }
}
// END
