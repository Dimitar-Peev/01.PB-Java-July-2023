package PB_Exams.PB_Online_Exam_15_and_16_June_2019;

import java.util.Scanner;

public class _05_Series {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0;

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double price = Double.parseDouble(scanner.nextLine());

            switch (name) {
                case "Thrones":
                    price *= 0.5;
                    break;
                case "Lucifer":
                    price *= 0.6;
                    break;
                case "Protector":
                    price *= 0.7;
                    break;
                case "TotalDrama":
                    price *= 0.8;
                    break;
                case "Area":
                    price *= 0.9;
                    break;
                default:
                    price = price;
                    break;

            }

            totalPrice += price;
        }

        if (budget >= totalPrice){
            System.out.printf("You bought all the series and left with %.2f lv.", budget - totalPrice);
        } else {
            System.out.printf("You need %.2f lv. more to buy the series!", Math.abs(budget - totalPrice));
        }
    }
}
