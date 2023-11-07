package _2_ConditionalStatements._2_Exercise;

import java.util.Scanner;

public class _08_LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String seriesName = scanner.nextLine();
        int durationOfTheSeries = Integer.parseInt(scanner.nextLine());
        int durationOfTheRest = Integer.parseInt(scanner.nextLine());

        double timeForLunch = durationOfTheRest / 8.0;
        double timeToRelax = durationOfTheRest / 4.0;
        double remainingTime = durationOfTheRest - timeForLunch - timeToRelax;
        double difference = Math.abs(remainingTime - durationOfTheSeries);

        if (remainingTime >= durationOfTheSeries) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", seriesName, Math.ceil(difference));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", seriesName, Math.ceil(difference));
        }

    }
}
