package _6_NestedLoops._2_Exercise;

import java.util.Scanner;

public class _05_SpecialNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1111; i <= 9999 ; i++) {
            String currentNum = String.valueOf(i);
            int count = 0;

            for (int j = 0; j < currentNum.length(); j++) {
                int digit = Integer.parseInt(String.valueOf(currentNum.charAt(j)));

                if (digit == 0) {
                    break;
                }

                if (n % digit == 0) {
                    ++count;
                }

            }

            if (count == 4) {
                System.out.print(i + " ");
            }
        }

    }
}
