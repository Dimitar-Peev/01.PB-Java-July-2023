package _6_NestedLoops._3_MoreExercises;

import java.util.Scanner;

public class _03_LuckyNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int d1 = 1; d1 <= 9; d1++) {
            for (int d2 = 1; d2 <= 9; d2++) {
                for (int d3 = 1; d3 <= 9; d3++) {
                    for (int d4 = 1; d4 <= 9; d4++) {
                        int sumFirstTwo = d1 + d2;
                        int sumLastTwo = d3 + d4;

                        if (sumFirstTwo == sumLastTwo && n % sumFirstTwo == 0) {
                            System.out.printf("%d%d%d%d ", d1, d2, d3, d4);
                        }
                    }
                }
            }
        }

        System.out.println();
    }
}
