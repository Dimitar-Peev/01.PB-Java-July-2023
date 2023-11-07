package _3_ConditionalStatementsAdvanced._2_Exercise;

import java.util.Scanner;

public class _01_Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projectionType = scanner.nextLine();
        int r = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        int seats = r * c;
        double ticketPrice;

        switch (projectionType) {
            case "Premiere":
                ticketPrice = 12.00;
                break;
            case "Normal":
                ticketPrice = 7.50;
                break;
            case "Discount":
                ticketPrice = 5.00;
                break;
            default:
                ticketPrice = 0.0;
                break;
        }

        double profit = seats * ticketPrice;
        System.out.printf("%.2f leva", profit);

    }
}
