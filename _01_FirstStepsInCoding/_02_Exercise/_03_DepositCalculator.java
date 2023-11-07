package _03_java.first.steps.in.coding.exercise;

import java.util.Scanner;

public class _03_DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double deposit = Double.parseDouble(scanner.nextLine());
        int period = Integer.parseInt(scanner.nextLine());
        double rate = Double.parseDouble(scanner.nextLine());

        double ratePerMonth = (deposit * (rate / 100)) / 12;
        double result = deposit + (period * ratePerMonth);

        System.out.println(result);
    }
}
