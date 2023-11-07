package PB_Online_Retake_Exam_2_and_3_May_2019;

import java.util.Scanner;

public class _03_MobileOperator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String termOfTheContract = scanner.nextLine();
        String typeContract = scanner.nextLine();
        String mobileInternet = scanner.nextLine();
        int months = Integer.parseInt(scanner.nextLine());

        double amount = 0;

        switch (termOfTheContract) {
            case "one":
                if (typeContract.equals("Small")) {
                    amount = 9.98;
                } else if (typeContract.equals("Middle")) {
                    amount = 18.99;
                } else if (typeContract.equals("Large")) {
                    amount = 25.98;
                } else if (typeContract.equals("ExtraLarge")) {
                    amount = 35.99;
                }
                break;

            case "two":
                if (typeContract.equals("Small")) {
                    amount = 8.58;
                } else if (typeContract.equals("Middle")) {
                    amount = 17.09;
                } else if (typeContract.equals("Large")) {
                    amount = 23.59;
                } else if (typeContract.equals("ExtraLarge")) {
                    amount = 31.79;
                }
                break;
        }

        if (mobileInternet.equals("yes")) {
            if (amount <= 10) {
                amount = amount + 5.50;
            } else if (amount <= 30) {
                amount = amount + 4.35;
            } else {
                amount = amount + 3.85;
            }
        }

        double totalSum = amount * months;

        if (termOfTheContract.equals("two")) {
            totalSum = totalSum - (totalSum * (3.75 / 100));
        }

        System.out.printf("%.2f lv.%n", totalSum);
    }
}
