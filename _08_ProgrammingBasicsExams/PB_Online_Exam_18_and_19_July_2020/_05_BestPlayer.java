package PB_Exams.PB_Online_Exam_18_and_19_July_2020;

import java.util.Scanner;

public class _05_BestPlayer {
    public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
		
		String name = scanner.nextLine();

        String bestFootballPlayer = "";
        int bestFootballPlayerGoals = Integer.MIN_VALUE;

        while (!name.equals("END")) {
            int goals = Integer.parseInt(scanner.nextLine());

            if (bestFootballPlayerGoals < goals) {
                bestFootballPlayer = name;
                bestFootballPlayerGoals = goals;
            }

            if (goals >= 10) {
                break;
            }

            name = scanner.nextLine();
        }

        System.out.printf("%s is the best player!\n", bestFootballPlayer);

        if (bestFootballPlayerGoals >= 3) {
            System.out.printf("He has scored %d goals and made a hat-trick !!!", bestFootballPlayerGoals);
        } else {
            System.out.printf("He has scored %d goals.", bestFootballPlayerGoals);
        }
    }
}
