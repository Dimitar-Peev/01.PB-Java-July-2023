package _2_ConditionalStatements._2_Exercise;

import java.util.Scanner;

public class _06_WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double currentRecord = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double time = Double.parseDouble(scanner.nextLine());

        double delay = (Math.floor(distance / 15)) * 12.5;
        double result = (distance * time) + delay;

        if (currentRecord > result) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", result);
        } else {
            double difference = result - currentRecord;
            System.out.printf("No, he failed! He was %.2f seconds slower.", difference);
        }

    }
}
