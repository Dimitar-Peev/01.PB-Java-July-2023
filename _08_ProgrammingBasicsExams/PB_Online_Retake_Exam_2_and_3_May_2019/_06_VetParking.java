package PB_Online_Retake_Exam_2_and_3_May_2019;

import java.util.Scanner;

public class _06_VetParking {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countDays = Integer.parseInt(scanner.nextLine());
        int countHours = Integer.parseInt(scanner.nextLine());

        double totalSum = 0;
        for (int day = 1; day <= countDays; day++) {
            double price = 0;
            double currentDaySum = 0;

            for (int hour = 1; hour <= countHours; hour++) {
                if (day % 2 == 0 && hour % 2 != 0) {
                    price = 2.5;
                } else if (day % 2 != 0 && hour % 2 == 0) {
                    price = 1.25;
                } else {
                    price = 1;
                }
                currentDaySum += price;
            }

            totalSum += currentDaySum;
            System.out.printf("Day: %d - %.2f leva%n", day, currentDaySum);
        }

        System.out.printf("Total: %.2f leva%n", totalSum);

    }
}
