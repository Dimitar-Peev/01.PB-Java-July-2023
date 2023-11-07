package _3_ConditionalStatementsAdvanced._1_Lab;

import java.util.Scanner;

public class _10_InvalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        boolean isValid = (number >= 100 && number <= 200 || number == 0);
        if (!isValid) {
            System.out.println("invalid");
        }

    } 
}
