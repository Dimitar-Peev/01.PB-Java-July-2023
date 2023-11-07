package _4_ForLoop._3_MoreExercises;

import java.util.Scanner;

public class _06_Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int months = Integer.parseInt(scanner.nextLine());

        double electricityBill = 0;

        for (int i = 0; i < months; i++) {
            double electricityBillPerMonth = Double.parseDouble(scanner.nextLine());
            electricityBill += electricityBillPerMonth;
        }

        System.out.printf("Electricity: %.2f lv%n", electricityBill);
        double waterBill = months * 20;
        System.out.printf("Water: %.2f lv%n", waterBill);
        double internetBill = months * 15;
        System.out.printf("Internet: %.2f lv%n", internetBill);
        double otherЕxpenses = (electricityBill + waterBill + internetBill) * 1.2;
        System.out.printf("Other: %.2f lv%n", otherЕxpenses);
        double averageBill = (electricityBill + waterBill + internetBill + otherЕxpenses) / months;
        System.out.printf("Average: %.2f lv%n", averageBill);

    }
}
