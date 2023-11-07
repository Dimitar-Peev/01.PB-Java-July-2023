package PB_Exams.PB_Online_Exam_6_and_7_July_2019;

import java.util.Scanner;

public class _03_TravelAgency {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String townName = scanner.nextLine();
        String type = scanner.nextLine();
        String VIP = scanner.nextLine();
        int countDays = Integer.parseInt(scanner.nextLine());

        boolean flag = false;
        double price = 0;

        if (townName.equals("Bansko") || townName.equals("Borovets")) {
            if (type.equals("withEquipment")) {
                price = 100;
                if (VIP.equals("yes")) {
                    price = price - (price * 0.1);
                }
            } else if (type.equals("noEquipment")) {
                price = 80;
                if (VIP.equals("yes")) {
                    price = price - (price * 0.05);
                }
            } else {
                flag = true;
            }

        } else if (townName.equals("Varna") || townName.equals("Burgas")) {
            if (type.equals("withBreakfast")) {
                price = 130;
                if (VIP.equals("yes")) {
                    price = price - (price * 0.12);
                }
            } else if (type.equals("noBreakfast")) {
                price = 100;
                if (VIP.equals("yes")) {
                    price = price - (price * 0.07);
                }
            } else {
                flag = true;
            }
        } else {
            flag = true;
        }

        if (countDays > 7) {
            countDays = countDays - 1;
        }

        if (countDays < 1) {
            System.out.println("Days must be positive number!");
        } else if (flag) {
            System.out.println("Invalid input!");
        } else {
            double totalSum = price * countDays;
            System.out.printf("The price is %.2flv! Have a nice time!", totalSum);
        }

    }
}
