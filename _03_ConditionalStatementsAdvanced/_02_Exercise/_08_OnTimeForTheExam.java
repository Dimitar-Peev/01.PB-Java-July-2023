package _3_ConditionalStatementsAdvanced._2_Exercise;

import java.util.Scanner;

public class _08_OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMinutes = Integer.parseInt(scanner.nextLine());

        int examTimeMinutes = (examHour * 60) + examMinutes;
        int arrivalTimeMinutes = (arrivalHour * 60) + arrivalMinutes;

        int diffMinutes = examTimeMinutes - arrivalTimeMinutes;

        String output;

        if (diffMinutes >= 0 && diffMinutes <= 30) {
            output = "On time";
        } else if (diffMinutes > 30) {
            output = "Early";
        } else {
            output = "Late";
        }

        System.out.println(output);

        String arrivalPeriod = diffMinutes < 0 ? "after" : "before";

        diffMinutes = Math.abs(diffMinutes);

        if (diffMinutes < 60) {
            System.out.printf("%d minutes %s the start", diffMinutes, arrivalPeriod);
        } else {
            System.out.printf("%d:%02d hours %s the start", diffMinutes / 60, diffMinutes % 60, arrivalPeriod);
        }
    }
}

