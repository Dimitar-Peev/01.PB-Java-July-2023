package _4_ForLoop._3_MoreExercises;

import java.util.Scanner;

public class _08_EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum1 = 0;
        int sum2 = 0;
        int diff = 0;

        for (int i = 1; i <= n; i++) {
            int num1 = Integer.parseInt(scanner.nextLine());
            int num2 = Integer.parseInt(scanner.nextLine());

            if (i % 2 == 0) {
                sum2 = num1 + num2;
            } else {
                sum1 = num1 + num2;
            }

            if (i > 1 && Math.abs(sum2 - sum1) > diff) {
                diff = Math.abs(sum2 - sum1);
            }

        }

        if (diff == 0) {
            System.out.println("Yes, value=" + sum1);
        } else {
            System.out.println("No, maxdiff=" + diff);
        }
    }
}

