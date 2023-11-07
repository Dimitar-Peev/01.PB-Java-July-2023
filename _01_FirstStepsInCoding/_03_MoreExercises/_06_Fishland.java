package _1_FirstStepsInCoding._3_MoreExercises;

import java.util.Scanner;

public class _06_Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double mackerelPricePerKg = Double.parseDouble(scanner.nextLine());
        double sprinklePricePerKg = Double.parseDouble(scanner.nextLine());
        double bonitoKg = Double.parseDouble(scanner.nextLine());
        double safridKg = Double.parseDouble(scanner.nextLine());
        int mussels = Integer.parseInt(scanner.nextLine());

        double bonitoPriceKg = (mackerelPricePerKg * 1.6) * bonitoKg;
        double safridPriceKg = (sprinklePricePerKg * 1.8) * safridKg;
        double musselsPriceKg = mussels * 7.5;

        double totalSum = bonitoPriceKg + safridPriceKg + musselsPriceKg;

        System.out.printf("%.2f", totalSum);


    }
}
