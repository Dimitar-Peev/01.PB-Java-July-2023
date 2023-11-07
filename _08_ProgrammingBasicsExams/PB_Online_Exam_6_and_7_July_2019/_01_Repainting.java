package PB_Exams.PB_Online_Exam_6_and_7_July_2019;

import java.util.Scanner;

public class _01_Repainting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nylonSize = Integer.parseInt(scan.nextLine());
        int paintLiters = Integer.parseInt(scan.nextLine());
        int diluentLiters = Integer.parseInt(scan.nextLine());
        int days = Integer.parseInt(scan.nextLine());

        double nylonPrice = 1.50;
        double paintPrice = 14.50;
        double diluentPrice = 5;
        double bagsPrice = 0.40;

        double expenses = (nylonSize + 2) * nylonPrice + paintLiters * 1.10 * paintPrice + diluentLiters * diluentPrice + bagsPrice;
        double workersExpenses = days * (expenses * 0.30);
        double totalExpenses = workersExpenses + expenses;

        System.out.println(String.format("Total expenses: %.2f lv.", totalExpenses));
    }
}
