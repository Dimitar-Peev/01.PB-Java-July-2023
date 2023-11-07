package _03_java.first.steps.in.coding.exercise;

import java.util.Scanner;

public class _05_SuppliesforSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pensNumbers = Integer.parseInt(scanner.nextLine());
        int markersNumbers = Integer.parseInt(scanner.nextLine());
        int prepInLitters = Integer.parseInt(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());

        double pensPrice = pensNumbers * 5.80;
        double markersPrice = markersNumbers * 7.20;
        double prepPrice = prepInLitters * 1.20;

        double sum = pensPrice + markersPrice + prepPrice;
        double result = sum - (sum * percent / 100);

        System.out.println(result);
    }
}
