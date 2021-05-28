package Excersise;

import java.util.*;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Set<String>> handOfCards = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("JOKER")) {
            String name = input.split(": ")[0];
            String[] arr = input.split(": ")[1].split(", ");
            Set<String> cards = new LinkedHashSet<>();
            Collections.addAll(cards, arr);
            if(!handOfCards.containsKey(name)) {
                handOfCards.put(name, cards);
            } else {
                //взима картите от името на играча
                Set<String> temp = handOfCards.get(name);
                //добавя новите изтеглени карти (не се допускат повтарящи се затова ползваме set)
                Collections.addAll(temp, arr);
                //презаписва ги в неговия ключ
                handOfCards.put(name, temp);
            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String, Set<String>> entry : handOfCards.entrySet()) {
            int value = getPowerOfCard(entry.getValue());
            System.out.printf("%s: %d%n", entry.getKey(), value);
        }
    }

    private static int getPowerOfCard(Set<String> cards) {
        //намерим сумата от картите
        int sum = 0;
        Map<Character, Integer> pointsValues = getPointsFromCards();
        for (String card : cards) {
           int points = 0;
           if(card.contains("10")) {
               //търсим дали е 10, защото само тогава char има 3 индекса
               //взимам силата му
               char strength = card.charAt(2);
               //умножавам по 10 силата от map в който пазя стойностите на картите
               points = 10 * pointsValues.get(strength);
           } else {
               char number = card.charAt(0);
               char strength = card.charAt(1);
                points = pointsValues.get(strength) * pointsValues.get(number);
           }
           sum += points;
        }

        return sum;
    }

    private static Map<Character, Integer> getPointsFromCards() {
        Map<Character, Integer> points = new HashMap<>();
        points.put('1', 1);
        points.put('2', 2);
        points.put('3', 3);
        points.put('4', 4);
        points.put('5', 5);
        points.put('6', 6);
        points.put('7', 7);
        points.put('8', 8);
        points.put('9', 9);
        points.put('J', 11);
        points.put('Q', 12);
        points.put('K', 13);
        points.put('A', 14);
        points.put('S', 4);
        points.put('H', 3);
        points.put('D', 2);
        points.put('C', 1);

        return points;

    }
}
