package PB_Online_Exam_20_and_21_April_2019;

import java.util.Scanner;

public class _01_EasterBakery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceFlour = Double.parseDouble(scanner.nextLine());
        double kilogramsFlour = Double.parseDouble(scanner.nextLine());
        double kilogramsSugar = Double.parseDouble(scanner.nextLine());
        int eggs = Integer.parseInt(scanner.nextLine());
        int yeast = Integer.parseInt(scanner.nextLine());

        double priceSugarKilograms = priceFlour * 0.75;
        double priceEggsKilograms = priceFlour * 1.1;
        double priceYeast = priceSugarKilograms * 0.2;

        double sum = (priceFlour * kilogramsFlour)
                + (priceSugarKilograms * kilogramsSugar)
                + (priceEggsKilograms * eggs)
                + (priceYeast * yeast);

        System.out.printf("%.2f", sum);
    }
}
