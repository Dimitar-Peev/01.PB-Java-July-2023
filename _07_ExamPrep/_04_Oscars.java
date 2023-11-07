package _7_ExamPrep;

import java.util.Scanner;

public class _04_Oscars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double startingPoint = Double.parseDouble(scanner.nextLine());
        int judgeCount = Integer.parseInt(scanner.nextLine());

        double actorPoints = 0;

        for (int i = 1; i <= judgeCount; i++) {
            String judgeName = scanner.nextLine();
            double judgePoints = Double.parseDouble(scanner.nextLine());

            actorPoints = actorPoints + ((judgeName.length() * judgePoints) / 2);

            if (i == 1) {
                actorPoints = actorPoints + startingPoint;
            }

            if (actorPoints > 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!",
                        actorName, actorPoints);
                return;
            }

        }


        double neededPoints = 1250.5 - actorPoints;
        System.out.printf("Sorry, %s you need %.1f more!", actorName, neededPoints);


    }
}
