package PB_Exams.PB_Online_Exam_28_and_29_March_2020;

import java.util.Scanner;

public class _05_CareOfPuppy {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int preparedFoodInKg = Integer.parseInt(scanner.nextLine()); 
        int preparedFoodInGrams = preparedFoodInKg * 1000;
        int totalEatenFood = 0; 


        String input = scanner.nextLine();
        while (!input.equals("Adopted")) {
            int eatenGrams = Integer.parseInt(input); 
            totalEatenFood += eatenGrams;

            input = scanner.nextLine();
        }

        if (preparedFoodInGrams >= totalEatenFood) {
            int leftGrams = preparedFoodInGrams - totalEatenFood;
            System.out.printf("Food is enough! Leftovers: %d grams.", leftGrams);
        } else {
            int needGrams = totalEatenFood - preparedFoodInGrams;
            System.out.printf("Food is not enough. You need %d grams more.", needGrams);
        }

    }
}
