package _4_ForLoop._3_MoreExercises;

import java.util.Scanner;

public class _05_GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int allNumbers = Integer.parseInt(scanner.nextLine());

        double result = 0;
        int invalidNumber = 0;
        int numberTo9 = 0;
        int numberTo19 = 0;
        int numberTo29 = 0;
        int numberTo39 = 0;
        int numberTo50 = 0;

        for (int i = 0; i < allNumbers; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number >= 0 && number < 10) {
                numberTo9++;
                result += number * 0.2;
            } else if (number >= 10 && number < 20) {
                numberTo19++;
                result += number * 0.3;
            } else if (number >= 20 && number < 30) {
                numberTo29++;
                result += number * 0.4;
            } else if (number >= 30 && number < 40) {
                numberTo39++;
                result += 50;
            } else if (number >= 40 && number <= 50) {
                numberTo50++;
                result += 100;
            } else {
                invalidNumber++;
                result = result / 2;
            }
        }

        System.out.printf("%.2f%n", result);
        double numberTo9Percent = (100.0 / allNumbers) * numberTo9;
        System.out.printf("From 0 to 9: %.2f%%%n", numberTo9Percent);
        double numberTo19Percent = (100.0 / allNumbers) * numberTo19;
        System.out.printf("From 10 to 19: %.2f%%%n", numberTo19Percent);
        double numberTo29Percent = (100.0 / allNumbers) * numberTo29;
        System.out.printf("From 20 to 29: %.2f%%%n", numberTo29Percent);
        double numberTo39Percent = (100.0 / allNumbers) * numberTo39;
        System.out.printf("From 30 to 39: %.2f%%%n", numberTo39Percent);
        double numberTo50Percent = (100.0 / allNumbers) * numberTo50;
        System.out.printf("From 40 to 50: %.2f%%%n", numberTo50Percent);
        double invalidPercent = (100.0 / allNumbers) * invalidNumber;
        System.out.printf("Invalid numbers: %.2f%%", invalidPercent);
    }
}
