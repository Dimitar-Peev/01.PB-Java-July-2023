package PB_Online_Exam_9_and_10_March_2019;

import java.util.Scanner;

public class _04_Darts {
    public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        String player = scanner.nextLine();

        int startingPoints = 301;
        int successfulShots = 0;
        int unsuccessfulShots = 0;

        String input = scanner.nextLine();
        while (!"Retire".equalsIgnoreCase(input)) {
            int currentPoints = Integer.parseInt(scanner.nextLine());
            int points = 0;
            switch (input) {
                case "Single":
                    points = currentPoints;
                    break;
                case "Double":
                    points = 2 * currentPoints;
                    break;
                case "Triple":
                    points = 3 * currentPoints;
                    break;
            }
			
            if (points <= startingPoints) {
                startingPoints -= points;
                successfulShots++;
            } else {
                unsuccessfulShots++;
            }

            if (startingPoints == 0) {
                break;
            }

            input = scanner.nextLine();
        }

        if (startingPoints == 0) {
            System.out.printf("%s won the leg with %d shots.", player, successfulShots);
        } else {
            System.out.printf("%s retired after %d unsuccessful shots.", player, unsuccessfulShots);
        }

    }
}
