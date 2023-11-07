package _3_ConditionalStatementsAdvanced._3_MoreExercises;

import java.util.Scanner;

public class _07_SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String groupType = scanner.nextLine();
        int countStudents = Integer.parseInt(scanner.nextLine());
        int countOvernight = Integer.parseInt(scanner.nextLine());

        String sportType = "";
        double pricePerNight = 0;

        switch (season) {
            case "Winter":
                if (groupType.equals("boys")) {
                    pricePerNight = 9.6;
                    sportType = "Judo";
                } else if (groupType.equals("girls")) {
                    pricePerNight = 9.6;
                    sportType = "Gymnastics";
                } else if (groupType.equals("mixed")) {
                    pricePerNight = 10;
                    sportType = "Ski";
                }
                break;
            case "Spring":
                if (groupType.equals("boys")) {
                    pricePerNight = 7.2;
                    sportType = "Tennis";
                } else if (groupType.equals("girls")) {
                    pricePerNight = 7.2;
                    sportType = "Athletics";
                } else if (groupType.equals("mixed")) {
                    pricePerNight = 9.5;
                    sportType = "Cycling";
                }
                break;
            case "Summer":
                if (groupType.equals("boys")) {
                    pricePerNight = 15;
                    sportType = "Football";
                } else if (groupType.equals("girls")) {
                    pricePerNight = 15;
                    sportType = "Volleyball";
                } else if (groupType.equals("mixed")) {
                    pricePerNight = 20;
                    sportType = "Swimming";
                }
                break;

        }

        double totalPrice = countStudents * pricePerNight * countOvernight;

        if (countStudents >= 10 && countStudents < 20) {
            totalPrice *= 0.95;
        } else if (countStudents >= 20 && countStudents < 50) {
            totalPrice *= 0.85;
        } else if (countStudents >= 50) {
            totalPrice *= 0.5;
        } else {
            totalPrice *= 1;
        }

        System.out.printf("%s %.2f lv.", sportType, totalPrice);
    }
}
