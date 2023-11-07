package _6_NestedLoops._2_Exercise;

import java.util.Scanner;

public class _03_SumPrimeNonPrime {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int primeNumsSum = 0;
        int nonPrimeNumsSum = 0;
        String input = scanner.nextLine();

        while (!"stop".equalsIgnoreCase(input)) {
            int num = Integer.parseInt(input);

            if (num < 0) {
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }

            boolean isPrimeNum = true;

            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrimeNum = false;
                    break;
                }
            }

            if (isPrimeNum) {
                primeNumsSum += num;
            } else {
                nonPrimeNumsSum += num;
            }

            input = scanner.nextLine();
        }

        System.out.printf("Sum of all prime numbers is: %d%n", primeNumsSum);
        System.out.printf("Sum of all non prime numbers is: %d%n", nonPrimeNumsSum);
    }
}
