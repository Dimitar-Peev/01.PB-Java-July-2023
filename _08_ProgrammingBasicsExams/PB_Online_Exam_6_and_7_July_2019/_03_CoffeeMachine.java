package PB_Exams.PB_Online_Exam_6_and_7_July_2019;

import java.util.Scanner;

public class _03_CoffeeMachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String drink = scanner.nextLine();
        String sugar = scanner.nextLine();
        int countDrinks = Integer.parseInt(scanner.nextLine());

        double price = 0;
        if (drink.equals("Espresso")) {
            if (sugar.equals("Without")) {
                price = 0.9;
            } else if (sugar.equals("Normal")) {
                price = 1;
            } else if (sugar.equals("Extra")) {
                price = 1.2;
            }
        } else if (drink.equals("Cappuccino")) {
            if (sugar.equals("Without")) {
                price = 1;
            } else if (sugar.equals("Normal")) {
                price = 1.2;
            } else if (sugar.equals("Extra")) {
                price = 1.6;
            }
        } else if (drink.equals("Tea")) {
            if (sugar.equals("Without")) {
                price = 0.5;
            } else if (sugar.equals("Normal")) {
                price = 0.6;
            } else if (sugar.equals("Extra")) {
                price = 0.7;
            }
        }

        double totalPrice = price * countDrinks;

        if (sugar.equals("Without")) {
            totalPrice = totalPrice * 0.65;
        }

        if (drink.equals("Espresso") && countDrinks >= 5) {
            totalPrice = totalPrice * 0.75;
        }

        if (totalPrice > 15) {
            totalPrice = totalPrice * 0.80;
        }

        System.out.printf("You bought %d cups of %s for %.2f lv.", countDrinks, drink, totalPrice);
    }
}
