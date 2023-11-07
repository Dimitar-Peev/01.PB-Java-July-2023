package PB_Exams.PB_Online_Exam_15_and_16_June_2019;

import java.util.Scanner;

public class _03_MovieDestination {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String destination = scanner.nextLine();
        String season = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());

        double price = 0;

        switch (destination) {
            case "Dubai":
                if (season.equals("Winter")) {
                    price = 45000;
                } else if (season.equals("Summer")) {
                    price = 40000;
                }
                break;
            case "Sofia":
                if (season.equals("Winter")) {
                    price = 17000;
                } else if (season.equals("Summer")) {
                    price = 12500;
                }
                break;
            case "London":
                if (season.equals("Winter")) {
                    price = 24000;
                } else if (season.equals("Summer")) {
                    price = 20250;
                }
                break;
        }

        double totalPrice = days * price;

        if (destination.equals("Dubai")) {
            totalPrice *= 0.7;
        }

        if (destination.equals("Sofia")) {
            totalPrice *= 1.25;
        }

        if (budget >= totalPrice) {
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!", budget - totalPrice);
        } else {
            System.out.printf("The director needs %.2f leva more!", totalPrice - budget);
        }
    }
}
