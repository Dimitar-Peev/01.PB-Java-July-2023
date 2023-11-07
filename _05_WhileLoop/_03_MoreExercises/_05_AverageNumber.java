package _5_WhileLoop._3_MoreExercises;

import java.util.Scanner;

public class _05_AverageNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double sum = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            sum += number;
        }

        System.out.printf("%.2f", sum / n);
    }
}
