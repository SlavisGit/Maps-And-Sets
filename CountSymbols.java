package Excersise;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<Character, Integer> characters = new TreeMap<>();
        String input = scanner.nextLine();
        for (int character = 0; character < input.length(); character++) {
            char current = input.charAt(character);
            if(!characters.containsKey(current)) {
                characters.put(current, 1);
            } else {
                characters.put(current, characters.get(current) + 1);
            }
        }
        for(Map.Entry<Character, Integer> current : characters.entrySet()) {
            System.out.print(current.getKey() + ": " + current.getValue() + " time/s");
            System.out.println();
        }
    }
}
