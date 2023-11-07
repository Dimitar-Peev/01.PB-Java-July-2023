package _6_NestedLoops._1_Lab;

import java.util.Scanner;

public class _04_SumOfTwoNumbersV2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int low = Integer.parseInt(scanner.nextLine());
        int high = Integer.parseInt(scanner.nextLine());
        int goal = Integer.parseInt(scanner.nextLine());

        boolean a = true;
        int comb = 0;
        loop: {
            for (int i = low; i <= high; i++) {
                for (int j = low; j <= high; j++) {
                    comb++;
                    if (i + j == goal) {

                    System.out.printf("Combination N:%d (%d + %d = %d)",
                            comb, i, j, goal);
                   a = false;
                   break loop;


                    }
                }
            }
        }

        if (a) {
            System.out.printf("%d combinations - neither equals %d",
                    comb, goal);
        }
    }
}
