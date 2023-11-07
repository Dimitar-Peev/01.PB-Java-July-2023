package _1_FirstStepsInCoding._3_MoreExercises;

import java.util.Scanner;

public class _03_CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double celsius = Double.parseDouble(scanner.nextLine());

        double fahrenheit = (celsius * (9.0 / 5)) + 32;

        System.out.printf("%.2f %n", fahrenheit);
    }
}
