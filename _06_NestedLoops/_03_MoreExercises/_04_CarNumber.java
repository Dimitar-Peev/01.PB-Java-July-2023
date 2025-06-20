package _6_NestedLoops._3_MoreExercises;

import java.util.Scanner;

public class _04_CarNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int start = scanner.nextInt();
        int end = scanner.nextInt();

        for (int d1 = start; d1 <= end; d1++) {
            for (int d2 = start; d2 <= end; d2++) {
                for (int d3 = start; d3 <= end; d3++) {
                    for (int d4 = start; d4 <= end; d4++) {
                        boolean firstEven = d1 % 2 == 0;
                        boolean lastEven = d4 % 2 == 0;

                        boolean parityCondition = (firstEven && !lastEven) || (!firstEven && lastEven);
                        boolean firstGreaterThanLast = d1 > d4;
                        boolean middleSumEven = (d2 + d3) % 2 == 0;

                        if (parityCondition && firstGreaterThanLast && middleSumEven) {
                            System.out.printf("%d%d%d%d ", d1, d2, d3, d4);
                        }
                    }
                }
            }
        }

        System.out.println();
    }
}
