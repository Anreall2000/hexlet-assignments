package exercise;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
class App {

    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> where) {
        List<Map<String, String>> filteredBooks = new ArrayList<>();
        for(var book : books) {
            if (isValidBook(book, where)) {
                filteredBooks.add(book);
            }
        }
        return filteredBooks;
    }

    public static boolean isValidBook(Map<String, String> book, Map<String, String> bookFilter) {
        for (var key : bookFilter.keySet()) {
            if (!book.get(key).equals(bookFilter.get(key))) {
                return false;
            }
        }
        return true;
    }
}
//END
