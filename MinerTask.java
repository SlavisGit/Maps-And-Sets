package Excersise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> mining  = new LinkedHashMap<>();
        String mineral = scanner.nextLine();
        while (!mineral.equals("stop")) {
            int count = Integer.parseInt(scanner.nextLine());
            if(!mining.containsKey(mineral)) {
                mining.put(mineral, count);
            } else {
                mining.put(mineral, mining.get(mineral) + count);
            }
            mineral = scanner.nextLine();
        }
        mining.forEach((key1, value) -> System.out.printf("%s -> %d%n", key1, value));
    }
}
