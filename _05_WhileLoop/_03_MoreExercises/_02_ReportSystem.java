package _5_WhileLoop._3_MoreExercises;

import java.util.Scanner;

public class _02_ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int expectedAmount = Integer.parseInt(scanner.nextLine());

        int payment = 0;
        int payWithCard = 0;
        int payWithCash = 0;
        double totalSumCard = 0;
        double totalSumCash = 0;
        int collectedAmount = 0;

        String command = scanner.nextLine();
        while (!command.equals("End")) {
            int price = Integer.parseInt(command);
            payment++;

            if (payment % 2 != 0) {
                if (price > 100) {
                    System.out.println("Error in transaction!");
                } else {
                    collectedAmount += price;
                    totalSumCash += price;
                    payWithCash++;
                    System.out.println("Product sold!");
                }
            }

            if (payment % 2 == 0) {
                if (price < 10) {
                    System.out.println("Error in transaction!");
                } else {
                    collectedAmount += price;
                    totalSumCard += price;
                    payWithCard++;
                    System.out.println("Product sold!");
                }
            }

            if (collectedAmount >= expectedAmount) {
                System.out.printf("Average CS: %.2f%n", totalSumCash / payWithCash);
                System.out.printf("Average CC: %.2f%n", totalSumCard / payWithCard);
                return;
            }

            command = scanner.nextLine();
        }

        System.out.println("Failed to collect required money for charity.");
    }
}
