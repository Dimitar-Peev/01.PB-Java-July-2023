package PB_Online_Exam_9_and_10_March_2019;

import java.util.Scanner;

public class _02_FootballResults {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int victory = 0;
        int lost = 0;
        int equality = 0;

        for (int i = 0; i < 3; i++) {
            String gameResult = scanner.nextLine();

            char hostPoints = gameResult.charAt(0);
            char guestPoints = gameResult.charAt(2);

            if (hostPoints > guestPoints) {
                victory++;
            } else if (guestPoints > hostPoints) {
                lost++;
            } else {
                equality++;
            }
        }

        System.out.printf("Team won %d games.%n", victory);
        System.out.printf("Team lost %d games.%n", lost);
        System.out.printf("Drawn games: %d%n", equality);


    }
}
