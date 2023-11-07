package _4_ForLoop._2_Exercise;

import java.util.Scanner;

public class _06_Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actor = scanner.nextLine();
        double points = Double.parseDouble(scanner.nextLine());
        int numOfJudges = Integer.parseInt(scanner.nextLine());

        final double pointsForNomination = 1250.5;

        for (int currentJudge = 0; currentJudge < numOfJudges; currentJudge++) {
            String currentJudgeName = scanner.nextLine();
            double currentJudgePoints = Double.parseDouble(scanner.nextLine());
            points += (currentJudgeName.length() * currentJudgePoints) / 2;

            if (points > pointsForNomination) {
                break;
            }
        }

        if (points > pointsForNomination) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!" , actor, points);
        } else {
            System.out.printf("Sorry, %s you need %.1f more!", actor, pointsForNomination - points);
        }

    }
}
