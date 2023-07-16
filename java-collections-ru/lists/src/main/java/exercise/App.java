package exercise;

import java.util.LinkedList;

class App {
    public static boolean scrabble(String letters, String word) {
        var lettersList = new LinkedList<>(letters.toLowerCase().chars().mapToObj(e -> (char) e).toList());
        for (char letter: word.toLowerCase().toCharArray()) {
            if (!lettersList.contains(letter)) {
                return false;
            }
            lettersList.remove((Character) letter);
        }
        return true;
    }
}
