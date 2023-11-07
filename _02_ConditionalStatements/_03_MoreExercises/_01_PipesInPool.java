package _2_ConditionalStatements._3_MoreExercises;

import java.util.Scanner;

public class _01_PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int v = Integer.parseInt(scanner.nextLine());
        int p1 = Integer.parseInt(scanner.nextLine());
        int p2 = Integer.parseInt(scanner.nextLine());
        double hours = Double.parseDouble(scanner.nextLine());

        double pipe1 = p1 * hours;
        double pipe2 = p2 * hours;
        double sumWater = pipe1 + pipe2;

        if (sumWater <= v) {
            pipe1 = (pipe1 / sumWater) * 100;
            pipe2 = (pipe2 / sumWater) * 100;
            sumWater = (sumWater / v) * 100;
            System.out.printf("The pool is  %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", sumWater, pipe1, pipe2);
        } else {
            sumWater = sumWater - v;
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", hours, sumWater);
        }

    }
}
