package _2_ConditionalStatements._3_MoreExercises;

import java.util.Scanner;

public class _04_TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kilometers = Integer.parseInt(scanner.nextLine());
        String dayTime = scanner.nextLine();

        double taxiStartPrice = 0.70;
        double taxiDaylyRate = 0.79;
        double taxiNightRate = 0.90;
        double bussPrice = 0.09;
        double trainPrice = 0.06;
        int bussMinDistance = 20;
        int trainMinDistance = 100;
        double price = 0.0;

        if (kilometers < 20) {
            if (dayTime.equals("day")) {
                price = taxiStartPrice + (kilometers * taxiDaylyRate);
            } else if (dayTime.equals("night")) {
                price = taxiStartPrice + (kilometers * taxiNightRate);
            }
        } else if (kilometers < trainMinDistance) {
            price = kilometers * bussPrice;
        } else {
            price = kilometers * trainPrice;
        }

        System.out.printf("%.2f", price);


    }
}
