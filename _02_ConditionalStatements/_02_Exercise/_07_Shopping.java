package _2_ConditionalStatements._2_Exercise;

import java.util.Scanner;

public class _07_Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCard = Integer.parseInt(scanner.nextLine());
        int processor = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        double priceVideoCard = videoCard * 250;
        double priceProcessors = processor * (priceVideoCard * 0.35);
        double priceRam = ram * (priceVideoCard * 0.1);
        double finalSum = priceVideoCard + priceProcessors + priceRam;

        if (videoCard > processor) {
            finalSum = finalSum - (finalSum * 0.15); 
        }

        double difference = Math.abs(finalSum - budget);

        if (budget >= finalSum) {
            System.out.printf("You have %.2f leva left!", difference);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", difference);
        }

    }
}
