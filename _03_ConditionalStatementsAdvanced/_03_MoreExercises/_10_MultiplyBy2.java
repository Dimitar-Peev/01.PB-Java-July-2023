package _3_ConditionalStatementsAdvanced._3_MoreExercises;

import java.util.Scanner;

public class _10_MultiplyBy2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            double number = Double.parseDouble(scanner.nextLine());
            if (number >= 0) {
                number *= 2;
            } else {
                System.out.println("Negative number!");
                break;
            }
            System.out.printf("Result: %.2f%n", number);
        }

    }
}
