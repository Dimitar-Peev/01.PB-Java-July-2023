package PB_Online_Exam_9_and_10_March_2019;

import java.util.Scanner;

public class _06_BasketballTournament {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int totalGamesCount = 0;
        int winGamesCount = 0;
        int lostGamesCount = 0;
		
        String input = scanner.nextLine();
        while (!input.equals("End of tournaments")) {
            String tournamentName = input;
            int gamesCount = Integer.parseInt(scanner.nextLine());

            for (int i = 1; i <= gamesCount; i++) {
                totalGamesCount++;

                int desiTeamPoints = Integer.parseInt(scanner.nextLine());
                int otherTeamPoints = Integer.parseInt(scanner.nextLine());

                int diff = Math.abs(desiTeamPoints - otherTeamPoints);

                if (desiTeamPoints > otherTeamPoints) {
                    winGamesCount++;
                    System.out.printf("Game %d of tournament %s: win with %d points.%n", i, tournamentName, diff);
                } else {
                    lostGamesCount++;
                    System.out.printf("Game %d of tournament %s: lost with %d points.%n", i, tournamentName, diff);
                }
            }

            input = scanner.nextLine();
        }

        double percentWin = winGamesCount * 1.0 / totalGamesCount * 100;
        System.out.printf("%.2f%% matches win%n", percentWin);
        double percentLost = lostGamesCount * 1.0 / totalGamesCount * 100;
        System.out.printf("%.2f%% matches lost%n", percentLost);
    }
}
