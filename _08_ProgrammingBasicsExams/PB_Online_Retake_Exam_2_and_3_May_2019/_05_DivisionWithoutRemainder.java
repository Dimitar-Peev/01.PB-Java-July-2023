package PB_Online_Retake_Exam_2_and_3_May_2019;

import java.util.Scanner;

public class _05_DivisionWithoutRemainder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int counterP1 = 0;
        int counterP2 = 0;
        int counterP3 = 0;

        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            if (num % 2 == 0) {
                counterP1++;
            }
            if (num % 3 == 0) {
                counterP2++;
            }
            if (num % 4 == 0) {
                counterP3++;
            }
        }

        double counterP1percent = counterP1 * 1.0 / n * 100;
        double counterP2percent = counterP2 * 1.0 / n * 100;
        double counterP3percent = counterP3 * 1.0 / n * 100;

        System.out.printf("%.2f%%\n", counterP1percent);
        System.out.printf("%.2f%%\n", counterP2percent);
        System.out.printf("%.2f%%", counterP3percent);
    }
}
