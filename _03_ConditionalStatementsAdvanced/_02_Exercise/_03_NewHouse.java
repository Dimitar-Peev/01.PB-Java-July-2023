package _3_ConditionalStatementsAdvanced._2_Exercise;

import java.util.Scanner;

public class _03_NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowersType = scanner.nextLine();
        int numberOfFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double price;

        switch (flowersType) {
            case "Roses":
                price = numberOfFlowers * 5;
                if (numberOfFlowers > 80) {
                    price = price * 0.9;
                }
                break;
            case "Dahlias":
                price = numberOfFlowers * 3.80;
                if (numberOfFlowers > 90) {
                    price = price * 0.85;
                }
                break;
            case "Tulips":
                price = numberOfFlowers * 2.80;
                if (numberOfFlowers > 80) {
                    price = price * 0.85;
                }
                break;
            case "Narcissus":
                price = numberOfFlowers * 3.00;
                if (numberOfFlowers < 120) {
                    price = price * 1.15;
                }
                break;
            case "Gladiolus":
                price = numberOfFlowers * 2.50;
                if (numberOfFlowers < 80) {
                    price = price * 1.20;
                }
                break;
            default:
                price = 0.0;
                break;
        }

        double diff = Math.abs(price - budget);

        if (price <= budget) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numberOfFlowers, flowersType, diff);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", diff);
        }
    }
}
