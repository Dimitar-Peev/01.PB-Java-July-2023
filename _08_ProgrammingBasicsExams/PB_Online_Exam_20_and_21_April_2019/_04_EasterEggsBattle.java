package PB_Online_Exam_20_and_21_April_2019;

import java.util.Scanner;

public class _04_EasterEggsBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countEggsFirst = Integer.parseInt(scanner.nextLine());
        int countEggsSecond = Integer.parseInt(scanner.nextLine());

        String winner = scanner.nextLine();
        while (!winner.equals("End")) {

            if (winner.equals("one")) {
                countEggsSecond -= 1;
            } else if (winner.equals("two")) {
                countEggsFirst -= 1;
            }
            if (countEggsFirst == 0 || countEggsSecond == 0) {
                break;
            }
            winner = scanner.nextLine();
        }

        if (countEggsFirst == 0) {
            System.out.printf("Player one is out of eggs. Player two has %d eggs left.", countEggsSecond);
        } else if (countEggsSecond == 0) {
            System.out.printf("Player two is out of eggs. Player one has %d eggs left.", countEggsFirst);
        } else {
            System.out.printf("Player one has %d eggs left.%n", countEggsFirst);
            System.out.printf("Player two has %d eggs left.%n", countEggsSecond);
        }

        scanner.close();
    }
}
