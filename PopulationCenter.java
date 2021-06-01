package Excersise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PopulationCenter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        //Map
        Map<String, Integer>countryPopulation = new LinkedHashMap<>();
        Map<String, Map<String, Integer>> population = new LinkedHashMap<>();
        while (!input.equals("report")) {
            String[] tokens = input.split("\\|");
            String country = tokens[1];
            String city = tokens[0];
            int people = Integer.parseInt(tokens[2]);
            if(!population.containsKey(country) && !countryPopulation.containsKey(country)) {
                Map<String, Integer> temp = new LinkedHashMap<>();
                temp.put(city, people);
                population.put(country, temp);
                //добавяме държава  => популация
                countryPopulation.put(country, people);
            } else {
                if(population.get(country).containsKey(city)) {
                    population.get(country).put(city, population.get(country).get(city) + people);
                } else {
                    population.get(country).put(city, people);
                }
                countryPopulation.put(country, countryPopulation.get(country) + people);
            }
            input = scanner.nextLine();
        }
        countryPopulation.entrySet().stream().sorted((v1, v2) -> Integer.compare(v2.getValue(), v1.getValue()))
              .forEach((key)-> {
                  System.out.printf("%s (total population: %d)%n", key.getKey(), key.getValue());
                  for (Map.Entry<String, Map<String, Integer>> entry : population.entrySet()) {
                      if(entry.getKey().equals(key.getKey())) {
                          entry.getValue().entrySet().stream().sorted((v1, v2)->Integer.compare(v2.getValue(), v1.getValue()))
                                  .forEach((element) -> System.out.printf("=>%s: %d%n", element.getKey(), element.getValue()));
                      }
                  }
              });

    }
}
