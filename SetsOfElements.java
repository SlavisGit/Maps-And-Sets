package Excersise;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstSet = scanner.nextInt();
        int secondSet = scanner.nextInt();
        scanner.nextLine();
        LinkedHashSet<Integer> first = new LinkedHashSet<>();
        LinkedHashSet<Integer> second = new LinkedHashSet<>();
        for (int count = 0; count < firstSet; count++) {
            int number = Integer.parseInt(scanner.nextLine());
            first.add(number);
        }
        for (int count = 0; count < secondSet; count++) {
            int number = Integer.parseInt(scanner.nextLine());
            second.add(number);
        }
        first.retainAll(second);
        for (Integer number : first) {
            System.out.print(number + " ");
        }
        /*for (Integer number1 : first) {
            for (Integer number2 : second) {
                if(number1.equals(number2)) {
                    System.out.print(number1 + " ");
                    break;
                }
            }
        } */
    }
}
