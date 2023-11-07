package PB_Exams.PB_Online_Exam_15_and_16_June_2019;

import java.util.Scanner;

public class _06_MovieTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Scanner inputReader = new Scanner(System.in);

        int a1 = Integer.parseInt(inputReader.nextLine());
        int a2 = Integer.parseInt(inputReader.nextLine());
        int n = Integer.parseInt(inputReader.nextLine());


        for (int i = a1; i <= (a2 - 1); i++) { 
            for (int j = 1; j <= (n - 1); j++) { 
                for (int k = 1; k <= (n / 2 - 1); k++) { 
                    if (i % 2 == 1 && (j + k + i) % 2 == 1) { 
                        System.out.printf("%c-%d%d%d%n", i, j, k, i);
                    }
                }
            }
        }

    }
}
