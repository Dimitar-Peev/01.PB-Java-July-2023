package _3_ConditionalStatementsAdvanced._2_Exercise;

import java.util.Scanner;

public class _05_Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        double price = 0.0;
        String destination = "";

        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                price = budget * 0.3;
            } else if (season.equals("winter")) {
                price = budget * 0.7;
            }
        } else if (budget <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                price = budget * 0.4;
            } else if (season.equals("winter")) {
                price = budget * 0.8;
            }
        } else if (budget > 1000) {
            destination = "Europe";
            price = budget * 0.9;
        }

        String type;

        if (season.equals("winter") || destination.equals("Europe")) {
            type = "Hotel";
        } else {
            type = "Camp";
        }
        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", type, price);

    }
}
