package Excersise;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<String> chemicals = new TreeSet<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int count = 0; count < n; count++) {
            String[] input = scanner.nextLine().split("\\s+");
            Collections.addAll(chemicals, input);
        }
        for (String chemical : chemicals) {
            System.out.print(chemical + " ");
        }
    }
}
