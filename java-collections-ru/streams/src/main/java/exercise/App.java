package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

// BEGIN
class App {

    private static List<String> hostList = List.of("gmail.com", "yandex.ru", "hotmail.com");
    public static long getCountOfFreeEmails(List<String> emails) {
        return emails.stream().filter(mail -> {
            var parts = mail.split("@");
            if (parts.length < 2) {
                return false;
            }
            var host = parts[1];
            return hostList.contains(host);
        }).count();
    }
}
// END
