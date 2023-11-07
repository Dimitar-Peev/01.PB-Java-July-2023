package _3_ConditionalStatementsAdvanced._2_Exercise;

import java.util.Scanner;

public class _04_FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermen = Integer.parseInt(scanner.nextLine());

        double shipPrice = 0.0;

        switch (season) {
            case "Spring":
                shipPrice = 3000;
                break;
            case "Summer":
            case "Autumn":
                shipPrice = 4200;
                break;
            case "Winter":
                shipPrice = 2600;
                break;
        }

        if (fishermen <= 6) {
            shipPrice = shipPrice * 0.9;
        } else if (fishermen <= 11) {
            shipPrice = shipPrice * 0.85;
        } else {
            shipPrice = shipPrice * 0.75;
        }

        if (fishermen % 2 == 0 && !season.equals("Autumn")) {
            shipPrice = shipPrice * 0.95;
        }

        double price = Math.abs(budget - shipPrice);

        if (budget >= shipPrice) {
            System.out.printf("Yes! You have %.2f leva left.", price);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", price);
        }
    }
}
