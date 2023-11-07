package PB_Exams.PB_Online_Exam_15_and_16_June_2019;

import java.util.Scanner;

public class _06_FavoriteMovie {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String movie = "";
        int best = 0;
        int count = 0;

        while (!input.equals("STOP")) {
            count++;
            int temp = 0;
            for (int i = 0; i < input.length(); i++) {
                int value = (int) input.charAt(i);

                if (value >= 65 && value <= 90) {
                    value -= input.length();
                } else if (value >= 97 && value <= 122) {
                    value -= input.length() * 2;
                }
                temp += value;
            }

            if (temp > best) {
                best = temp;
                movie = input;
            }
            if (count == 7) {
                System.out.println("The limit is reached.");
                break;
            }
            input = scanner.nextLine();
        }

        System.out.printf("The best movie for you is %s with %d ASCII sum.", movie, best);
    }
}
