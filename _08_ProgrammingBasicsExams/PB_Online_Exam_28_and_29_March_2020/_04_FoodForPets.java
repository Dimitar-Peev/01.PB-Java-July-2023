package PB_Exams.PB_Online_Exam_28_and_29_March_2020;

import java.util.Scanner;

public class _04_FoodForPets {
    public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double allFood = Double.parseDouble(scanner.nextLine());
		
        double biscuits = 0;
        double dogFood = 0;
        double catFood = 0;
		
        for (int i = 1; i <= days; i++) {
            int d = Integer.parseInt(scanner.nextLine());
            int c = Integer.parseInt(scanner.nextLine());
            dogFood += d;
            catFood += c;
            if (i % 3 == 0) {
                biscuits += (d + c) * 0.1;
            }
        }
		
        System.out.printf("Total eaten biscuits: %dgr.%n", Math.round(biscuits));
        System.out.printf("%.2f%% of the food has been eaten.%n", (((dogFood + catFood) / allFood) * 100));
        System.out.printf("%.2f%% eaten from the dog.%n", (dogFood / (dogFood + catFood) * 100));
        System.out.printf("%.2f%% eaten from the cat.%n", (catFood / (dogFood + catFood) * 100));
    }
}
