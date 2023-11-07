package _2_ConditionalStatements._3_MoreExercises;

import java.util.Scanner;

public class _03_Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = Integer.parseInt(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        int zLitters = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        double grapes = x * y;
        double wine = (0.4 * grapes) / 2.5;
        double diff = Math.abs(wine - zLitters);

        if (wine >= zLitters) {
            double profitPerPerson = diff / workers;
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n", Math.floor(wine));
            System.out.printf("%.0f liters left -> %.0f liters per person.", Math.ceil(diff), Math.ceil(profitPerPerson));
        } else if (wine < zLitters) {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(diff));
        }

    }
}
