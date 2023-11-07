package PB_Online_Exam_20_and_21_April_2019;

import java.util.Scanner;

public class _02_EasterParty {
    public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        int countGuest = Integer.parseInt(scanner.nextLine());
        double pricePerEnvelope = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        if (countGuest >= 10 && countGuest <= 15) {
            pricePerEnvelope *= 0.85;
        } else if (countGuest >= 16 && countGuest <= 20) {
            pricePerEnvelope *= 0.8;
        } else if (countGuest >= 21) {
            pricePerEnvelope *= 0.75;
        }
		
        double sum = countGuest * pricePerEnvelope + (budget * 0.1);

        if (sum >= budget) {
            System.out.printf("No party! %.2f leva needed.", sum - budget);
        } else {
            System.out.printf("It is party time! %.2f leva left.", budget - sum);
        }
    }
}
