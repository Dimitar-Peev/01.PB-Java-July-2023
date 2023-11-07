package PB_Online_Retake_Exam_2_and_3_May_2019;

import java.util.Scanner;

public class _02_Safari {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double fuel = Double.parseDouble(scanner.nextLine());
        String dayOfWeek = scanner.nextLine();

        double totalSum = (fuel * 2.10) + 100;

        if (dayOfWeek.equals("Saturday")) {
            totalSum = totalSum * 0.90;
        } else if (dayOfWeek.equals("Sunday")) {
            totalSum = totalSum * 0.80;
        }

        double diff = Math.abs(budget - totalSum);
		
        if (budget >= totalSum) {
            System.out.printf("Safari time! Money left: %.2f lv.", diff);
        } else {
            System.out.printf("Not enough money! Money needed: %.2f lv.", diff);
        }
    }
}
