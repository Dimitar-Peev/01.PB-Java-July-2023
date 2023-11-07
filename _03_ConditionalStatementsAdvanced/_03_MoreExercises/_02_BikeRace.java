package _3_ConditionalStatementsAdvanced._3_MoreExercises;

import java.util.Scanner;

public class _02_BikeRace {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int juniors = Integer.parseInt(scanner.nextLine());
        int seniors = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();

        double juniorsTax = 0;
        double seniorsTax = 0;

        switch (type) {
            case "trail":
                juniorsTax = 5.5;
                seniorsTax = 7;
                break;
            case "cross-country":
                juniorsTax = 8;
                seniorsTax = 9.5;
                break;
            case "downhill":
                juniorsTax = 12.25;
                seniorsTax = 13.75;
                break;
            case "road":
                juniorsTax = 20;
                seniorsTax = 21.5;
                break;

        }

        double totalPrice = (juniors * juniorsTax) + (seniors * seniorsTax);
        int sumPeople = juniors + seniors;

        if (type.equals("cross-country")){
            if (sumPeople >= 50) {
                totalPrice = totalPrice * 0.75;
            }
        }

        System.out.printf("%.2f", totalPrice * 0.95);

    }
}
