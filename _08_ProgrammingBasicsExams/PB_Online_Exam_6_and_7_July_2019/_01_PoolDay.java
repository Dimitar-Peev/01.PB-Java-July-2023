package PB_Exams.PB_Online_Exam_6_and_7_July_2019;

import java.util.Scanner;

public class _01_PoolDay {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        double emtrancefee = Double.parseDouble(scanner.nextLine());
        double chairPrice = Double.parseDouble(scanner.nextLine());
        double umbrellaPrice = Double.parseDouble(scanner.nextLine());

        double allFees = emtrancefee * people;
        double allChairs = Math.ceil(0.75 * people) * chairPrice;
        double allUmbrellas = Math.ceil(0.5 * people) * umbrellaPrice;
        double totalSum = allFees + allChairs + allUmbrellas;

        System.out.printf("%.2f lv.", totalSum);
    }

}
