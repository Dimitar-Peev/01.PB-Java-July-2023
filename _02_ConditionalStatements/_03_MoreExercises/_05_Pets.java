package _2_ConditionalStatements._3_MoreExercises;

import java.util.Scanner;

public class _05_Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int foodInKg = Integer.parseInt(scanner.nextLine());
        double dogFoodKg = Double.parseDouble(scanner.nextLine());
        double catFoodKg = Double.parseDouble(scanner.nextLine());
        double turtleFoodGrams = Double.parseDouble(scanner.nextLine());

        double neededFood = (days * dogFoodKg) + (days * catFoodKg) + (days * turtleFoodGrams / 1000);

        if (foodInKg >= neededFood) {
            System.out.printf("%.0f kilos of food left.", Math.floor(foodInKg - neededFood));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(neededFood-foodInKg));
        }
    }
}
