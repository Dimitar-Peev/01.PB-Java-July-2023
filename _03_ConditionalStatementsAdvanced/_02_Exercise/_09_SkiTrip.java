package _3_ConditionalStatementsAdvanced._2_Exercise;

import java.util.Scanner;

public class _09_SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String assessment = scanner.nextLine();

        double overNights = days - 1;
        double price = 0.0;

        switch (roomType){
            case "room for one person":
                price = overNights * 18;
                break;
            case "apartment":
                price = overNights * 25;

                if (overNights < 10) {
                    price = price * 0.7;
                } else if (overNights <= 15) {
                    price = price * 0.65;
                } else {
                    price = price * 0.5;
                }
                break;
            case "president apartment":
                price = overNights * 35;
                if (overNights < 10) {
                    price = price * 0.9;
                } else if (overNights <= 15) {
                    price = price * 0.85;
                } else {
                    price = price * 0.8;
                }
                break;
        }
        
        if (assessment.equals("positive")){
            price = price + (price * 0.25);
        } else if (assessment.equals("negative")) {
            price = price - (price * 0.1);
        }

        System.out.printf("%.2f", price);

    }
}
