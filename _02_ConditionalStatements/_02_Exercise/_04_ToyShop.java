package _2_ConditionalStatements._2_Exercise;

import java.util.Scanner;

public class _04_ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double excursion = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        int numberOfToys = puzzles + dolls + bears + minions + trucks;
        double priceForPuzzles = puzzles * 2.60;
        double priceForDolls = dolls * 3.00;
        double priceForBears = bears * 4.10;
        double priceForMinions = minions * 8.20;
        double priceForTrucks = trucks * 2.00;
        double sumTotal = priceForPuzzles + priceForDolls + priceForBears + priceForMinions + priceForTrucks;
        sumTotal = sumTotal - (sumTotal * 0.1);

        if (numberOfToys >= 50) {
            sumTotal = sumTotal * 0.75;
        }

        double difference = Math.abs(sumTotal - excursion);

        if (sumTotal >= excursion) {
            System.out.printf("Yes! %.2f lv left.", difference);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", difference);
        }

    }
}
