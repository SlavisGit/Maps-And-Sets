package Excersise;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Set<String> words = new LinkedHashSet<>();
        for (int count = 0; count < n; count++) {
            String input = scanner.nextLine();
            words.add(input);
        }
        for (String word : words) {
            System.out.println(word);
        }
    }
}
