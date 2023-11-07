package PB_Online_Exam_9_and_10_March_2019;

import java.util.Scanner;

public class _05_TennisRanklist {
    public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        int countTournament = Integer.parseInt(scanner.nextLine());
        int pointsInRanglists = Integer.parseInt(scanner.nextLine());

        double counterWinTournament = 0;
        int sumPoints = 0;

        for (int i = 0; i < countTournament; i++) {
            String stagetournament = scanner.nextLine();

            if (stagetournament.equals("W")) {
                sumPoints += 2000;
                counterWinTournament++;
            } else if (stagetournament.equals("F")) {
                sumPoints += 1200;
            } else if (stagetournament.equals("SF")) {
                sumPoints += 720;
            }
        }
		
        System.out.printf("Final points: %d%n", sumPoints + pointsInRanglists);
        System.out.printf("Average points: %.0f%n", Math.floor((double) sumPoints / countTournament));
        System.out.printf("%.2f%%", (counterWinTournament / countTournament) * 100);
    }
}
