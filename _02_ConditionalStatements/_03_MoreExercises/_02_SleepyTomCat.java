package _2_ConditionalStatements._3_MoreExercises;

import java.util.Scanner;

public class _02_SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int restDays = Integer.parseInt(scanner.nextLine());

        int gameMinutesPerYear = 30000;
        int minutesForGameInWorkingDay = 63;
        int minutesForGameInDayOff = 127;

        int workingDays = 365 - restDays;
        int realGameMinutes = workingDays * minutesForGameInWorkingDay + restDays * minutesForGameInDayOff;
        int hours = Math.abs(gameMinutesPerYear - realGameMinutes) / 60;
        int minutes = Math.abs(gameMinutesPerYear - realGameMinutes) % 60;

        if (realGameMinutes > gameMinutesPerYear) {
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play", hours, minutes);
        } else {
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play", hours, minutes);
        }

    }
}
