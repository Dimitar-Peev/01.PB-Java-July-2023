package _3_ConditionalStatementsAdvanced._2_Exercise;

import java.util.Scanner;

public class _06_OperationBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);

        if (b == 0 && (operator == '/' || operator == '%')) {
            System.out.printf("Cannot divide %d by zero", a);
        } else {
            double result = 0.0;
            switch (operator) {
                case '*':
                    result = a * b;
                    break;
                case '/':
                    result = (double) a / b; // or 1.0 * a / b;
                    break;
                case '%':
                    result = a % b;
                    break;
                case '+':
                    result = a + b;
                    break;
                case '-':
                    result = a - b;
                    break;
            }

            if (operator == '*' || operator == '-' || operator == '+') {
                // ? Ternary Operator
                // String evenOrOdd = result % 2 == 0 ? "even" : "odd";

                String evenOrOdd;
                if (result % 2 == 0) {
                    evenOrOdd = "even";
                } else {
                    evenOrOdd = "odd";
                }

                System.out.printf("%d %c %d = %.0f - %s", a, operator, b, result, evenOrOdd);
            } else if (operator == '/') {
                System.out.printf("%d %c %d = %.2f", a, operator, b, result);
            } else if (operator == '%') {
                System.out.printf("%d %c %d = %.0f", a, operator, b, result);
            }

        }

    }
}
