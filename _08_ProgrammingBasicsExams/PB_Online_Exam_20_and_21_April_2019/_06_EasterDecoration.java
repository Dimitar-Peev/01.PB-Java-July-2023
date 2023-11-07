package PB_Online_Exam_20_and_21_April_2019;

import java.util.Scanner;

public class _06_EasterDecoration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int clients = Integer.parseInt(scanner.nextLine());

        double totalSum = 0;

        for (int i = 0; i < clients; i++) {

            String input = scanner.nextLine();
            double expenses = 0;
            int product = 0;

            while (!"Finish".equalsIgnoreCase(input)) {
                product++;
                switch (input) {
                    case "basket":
                        expenses += 1.5;
                        break;
                    case "wreath":
                        expenses += 3.8;
                        break;
                    case "chocolate bunny":
                        expenses += 7.0;
                        break;
                }

                input = scanner.nextLine();
            }
            if (product % 2 == 0) {
                expenses *= 0.8;
            }
			
            System.out.printf("You purchased %d items for %.2f leva.%n", product, expenses);
            totalSum += expenses;

        }

        double averageAmount = totalSum / clients;
        System.out.printf("Average bill per client is: %.2f leva.", averageAmount);

    }
}
