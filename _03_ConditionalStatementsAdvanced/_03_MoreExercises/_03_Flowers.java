package _3_ConditionalStatementsAdvanced._3_MoreExercises;

import java.util.Scanner;

public class _03_Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countChrysanthemums = Integer.parseInt(scanner.nextLine());
        int countRoses = Integer.parseInt(scanner.nextLine());
        int countTulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String holiday = scanner.nextLine();

        double priceChrysanthemums = 0;
        double priceRoses = 0;
        double priceTulips = 0;

        if (season.equals("Spring") || season.equals("Summer")) {
            priceChrysanthemums = 2.00;
            priceRoses = 4.10;
            priceTulips = 2.50;
        } else if (season.equals("Autumn") || season.equals("Winter")) {
            priceChrysanthemums = 3.75;
            priceRoses = 4.50;
            priceTulips = 4.15;
        }

        double totalPrice = (countChrysanthemums * priceChrysanthemums)
                + (countRoses * priceRoses)
                + (countTulips * priceTulips);


        if (holiday.equals("Y")) {
            totalPrice *= 1.15;
        }

        if (season.equals("Spring") && countTulips > 7) {
            totalPrice *= 0.95;
        }

        if (season.equals("Winter") && countRoses >= 10) {
            totalPrice *= 0.90;
        }

        double countFlowers = countChrysanthemums + countTulips + countRoses;

        if ((season.equals("Spring")
                || season.equals("Summer")
                || season.equals("Autumn")
                || season.equals("Winter"))
                && countFlowers > 20) {
            totalPrice *= 0.80;
        } else {
            totalPrice *= 1;
        }

        System.out.printf("%.2f", totalPrice + 2);
    }
}
