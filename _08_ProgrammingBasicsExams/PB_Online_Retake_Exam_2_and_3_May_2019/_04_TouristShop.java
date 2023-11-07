package PB_Online_Retake_Exam_2_and_3_May_2019;

import java.util.Scanner;

public class _04_TouristShop {
    public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());

        int countProduct = 0;
        double copyBudget = budget;
        boolean isNotEnough = false;
		
		String inputLine = scanner.nextLine();
        while (!inputLine.equals("Stop")) {
            String product = inputLine;
            double priceProduct = Double.parseDouble(scanner.nextLine());
            countProduct++;

            if (countProduct % 3 == 0) {
                priceProduct = priceProduct / 2;
            }

            copyBudget = copyBudget - priceProduct;

            if (copyBudget < 0) {
                isNotEnough = true;
                break;
            }

            inputLine = scanner.nextLine();
        }

        if (isNotEnough) {
            System.out.println("You don't have enough money!");
            System.out.printf("You need %.2f leva!%n", Math.abs(copyBudget));
        } else {
            System.out.printf("You bought %d products for %.2f leva.%n", countProduct, budget - copyBudget);
        }

    }
}
