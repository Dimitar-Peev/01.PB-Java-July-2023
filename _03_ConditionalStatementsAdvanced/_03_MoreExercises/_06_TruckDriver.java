package _3_ConditionalStatementsAdvanced._3_MoreExercises;

import java.util.Scanner;

public class _06_TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double kilometersPerMonth = Double.parseDouble(scanner.nextLine());

        double pricePerKm = 0;

        switch (season) {
            case "Spring":
            case "Autumn":
                if (kilometersPerMonth <= 5000) {
                    pricePerKm = 0.75;

                } else if (kilometersPerMonth <= 10000) {
                    pricePerKm = 0.95;
                } else if (kilometersPerMonth <= 20000) {
                    pricePerKm = 1.45;
                }
                break;
            case "Summer":
                if (kilometersPerMonth <= 5000) {
                    pricePerKm = 0.9;

                } else if (kilometersPerMonth <= 10000) {
                    pricePerKm = 1.1;
                } else if (kilometersPerMonth <= 20000) {
                    pricePerKm = 1.45;
                }
                break;
            case "Winter":
                if (kilometersPerMonth <= 5000) {
                    pricePerKm = 1.05;

                } else if (kilometersPerMonth <= 10000) {
                    pricePerKm = 1.25;
                } else if (kilometersPerMonth <= 20000) {
                    pricePerKm = 1.45;
                }
                break;
        }

        double salary = 4 * (kilometersPerMonth * pricePerKm);

        double salaryAfterTax = salary * 0.9;
        System.out.printf("%.2f", salaryAfterTax);
    }
}
