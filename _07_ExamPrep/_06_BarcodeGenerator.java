package PB_Exams.PB_Online_Exam_18_and_19_July_2020;

import java.util.Scanner;

public class _06_BarcodeGenerator {
    public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        String firstNum = scanner.nextLine();
        String secondNum = scanner.nextLine();

        for (int i = firstNum.charAt(0); i <= secondNum.charAt(0); i++) {
            for (int j = firstNum.charAt(1); j <= secondNum.charAt(1); j++) {
                for (int k = firstNum.charAt(2); k <= secondNum.charAt(2); k++) {
                    for (int l = firstNum.charAt(3); l <= secondNum.charAt(3); l++) {
                        if (i % 2 != 0 && j % 2 != 0 && k % 2 != 0 && l % 2 != 0) {
                            System.out.printf("%c%c%c%c ", i, j, k, l);
                        }
                    }
                }
            }
        }
    }
}
