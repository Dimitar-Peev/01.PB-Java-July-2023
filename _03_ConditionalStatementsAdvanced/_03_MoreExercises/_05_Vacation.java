package _3_ConditionalStatementsAdvanced._3_MoreExercises;

import java.util.Scanner;

public class _05_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String location = "";
        String place = "";
        double price = 0;

        if (budget <= 1000) {
            location = "Camp";
            switch (season) {
                case "Summer":
                    place = "Alaska";
                    price = budget * 0.65;
                    break;
                case "Winter":
                    place = "Morocco";
                    price = budget * 0.45;
                    break;
            }
        } else if (budget <= 3000) {
            location = "Hut";
            switch (season) {
                case "Summer":
                    place = "Alaska";
                    price = budget * 0.8;
                    break;
                case "Winter":
                    place = "Morocco";
                    price = budget * 0.6;
                    break;
            }
        } else if (budget > 3000) {
            location = "Hotel";
            switch (season) {
                case "Summer":
                    place = "Alaska";
                    price = budget * 0.9;
                    break;
                case "Winter":
                    place = "Morocco";
                    price = budget * 0.9;
                    break;
            }

        }


        System.out.printf("%s - %s - %.2f", place, location, price);
    }
}
