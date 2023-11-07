package _6_NestedLoops._2_Exercise;

import java.util.Scanner;

public class _02_EqualSumsEvenOddPosition {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        for (int i = a; i <= b; i++) {
            String currentNum = String.valueOf(i);
            int evenSum = 0; 
            int oddSum = 0; 

            for (int j = 0; j < currentNum.length(); j++) {
                int digit = Integer.parseInt(String.valueOf(currentNum.charAt(j)));

                if (j % 2 == 0) {
                    evenSum += digit;
                } else {
                    oddSum += digit;
                }
            }

            if (evenSum == oddSum) {
                System.out.print(currentNum + " ");
            }
        }
    }
}
