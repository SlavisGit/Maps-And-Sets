package Excersise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Map<String, String> namesAndEmails = new LinkedHashMap<>();
        while (!name.equals("stop")) {
            String email = scanner.nextLine();
            if(email.endsWith("uk") || email.endsWith("us") || email.endsWith("com")) {
                name = scanner.nextLine();
                continue;
            } else {
                namesAndEmails.put(name, email);
            }
            name = scanner.nextLine();
        }
        namesAndEmails.forEach((key, value) -> System.out.printf("%s -> %s%n", key, value));
    }
}
