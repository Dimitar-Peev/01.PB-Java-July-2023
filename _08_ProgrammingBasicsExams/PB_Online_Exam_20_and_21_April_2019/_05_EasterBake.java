package PB_Online_Exam_20_and_21_April_2019;

import java.util.Scanner;

public class _05_EasterBake {
    public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        int easterBread = Integer.parseInt(scanner.nextLine());
        int sugarPack = 950;
        int flourPack = 750;

        int totalSugar = 0;
        int totalFlour = 0;

        int maxSugar = Integer.MIN_VALUE;
        int maxFlour = Integer.MIN_VALUE;

        for (int i = 0; i < easterBread; i++) {
            int sugarGrams = Integer.parseInt(scanner.nextLine());
            int flourGrams = Integer.parseInt(scanner.nextLine());

            if (sugarGrams > maxSugar) {
                maxSugar = sugarGrams;
            }

            if (flourGrams > maxFlour) {
                maxFlour = flourGrams;
            }

            totalSugar += sugarGrams;
            totalFlour += flourGrams;


        }

        System.out.printf("Sugar: %.0f%n", Math.ceil(totalSugar * 1.0 / sugarPack));
        System.out.printf("Flour: %.0f%n", Math.ceil(totalFlour * 1.0 / flourPack));
        System.out.printf("Max used flour is %d grams, max used sugar is %d grams.", maxFlour, maxSugar);

        scanner.close();
    }
}
