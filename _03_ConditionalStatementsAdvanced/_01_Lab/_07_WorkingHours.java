package _3_ConditionalStatementsAdvanced._1_Lab;

import java.util.Scanner;

public class _07_WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        String dayOfWeek = scanner.nextLine();

        boolean isClosed = hour < 10 || hour > 18 || dayOfWeek.equals("Sunday");

        if (isClosed) {
            System.out.println("closed");
        } else {
            System.out.println("open");
        }


    }
}
