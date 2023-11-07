package _1_FirstStepsInCoding._3_MoreExercises;

import java.util.Scanner;

public class _01_TrapeziodArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double b1 = Double.parseDouble(scanner.nextLine());
        double b2 = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double formula = (b1 + b2) * (h / 2);

        System.out.printf("%.2f%n", formula);


    }
}
