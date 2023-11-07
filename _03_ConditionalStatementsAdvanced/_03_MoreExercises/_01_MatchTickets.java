package _3_ConditionalStatementsAdvanced._3_MoreExercises;

import java.util.Scanner;

public class _01_MatchTickets {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine());

        double restSum = 0;

        if (people <= 4) {
            restSum = budget - (budget * 0.75);
        } else if (people <= 9) {
            restSum = budget - (budget * 0.6);
        } else if (people <= 24) {
            restSum = budget - (budget * 0.5);
        } else if (people <= 49) {
            restSum = budget - (budget * 0.4);
        } else {
            restSum = budget - (budget * 0.25);
        }

        switch (category) {
            case "VIP":
                restSum -= 499.99 * people;
                break;
            case "Normal":
                restSum -= 249.99 * people;
                break;
        }

        if (restSum > 0) {
            System.out.printf("Yes! You have %.2f leva left.", restSum);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", Math.abs(restSum));
        }

    }
}
