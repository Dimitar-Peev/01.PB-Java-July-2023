package PB_Online_Exam_6_and_7_April_2019;

import java.util.Scanner;

public class _02_GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int numOfPeople = Integer.parseInt(scanner.nextLine());
        double pricePerPerson = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.1;
        double costumerPrice = pricePerPerson * numOfPeople;

        if (numOfPeople > 150) {
            costumerPrice = costumerPrice - costumerPrice * 0.1;
        }

        double result = decor + costumerPrice;
        double diff = Math.abs(budget - result);

        if (budget >= result) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", diff);
        } else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", diff);
        }
    }
}
