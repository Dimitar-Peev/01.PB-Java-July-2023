package _1_FirstStepsInCoding._3_MoreExercises;

import java.util.Scanner;

public class _08_CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double r = Double.parseDouble(scanner.nextLine());

        double s = Math.PI * r * r;
        double p = 2 * r * Math.PI;

        System.out.printf("%.2f\n", s);
        System.out.printf("%.2f", p);
    }
}
