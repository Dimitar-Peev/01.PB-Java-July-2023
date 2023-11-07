package _1_FirstStepsInCoding._3_MoreExercises;

import java.util.Scanner;

public class _07_HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double greenArea = 2 * (x * y) - 2 * (1.5 * 1.5) + 2 * (x * x) - 1.2 * 2;
        double greenPaint = greenArea / 3.4;
        double redArea = 2 * (x * y) + 2 * ((x * h) / 2);
        double redPaint = redArea / 4.3;

        System.out.printf("%.2f%n", greenPaint);
        System.out.printf("%.2f", redPaint);

    }
}
