package _7_ExamPrep;

import java.util.Scanner;

public class _03_WorldSnookerChampionship {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String championshipStage = scanner.nextLine();
        String ticketType = scanner.nextLine();
        int numberTicket = Integer.parseInt(scanner.nextLine());
        String cupPhoto = scanner.nextLine();

        double price = 0;
        if (championshipStage.equals("Quarter final")) {

            switch (ticketType) {
                case "Standard":
                    price = numberTicket * 55.50;
                    break;
                case "Premium":
                    price = numberTicket * 105.20;
                    break;

                case "VIP":
                    price = numberTicket * 118.90;
                    break;
            }


        } else if (championshipStage.equals("Semi final")) {


            if (ticketType.equals("Standard")) {
                price = numberTicket * 75.88;
            } else if (ticketType.equals("Premium")) {
                price = numberTicket * 125.22;
            } else if (ticketType.equals("VIP")) {
                price = numberTicket * 300.40;
            }

        } else if (championshipStage.equals("Final")) {

            if (ticketType.equals("Standard")) {
                price = numberTicket * 110.10;
            } else if (ticketType.equals("Premium")) {
                price = numberTicket * 160.66;
            } else if (ticketType.equals("VIP")) {
                price = numberTicket * 400;
            }

        }


        double finalPrice = 0;
        if (price > 4000) {
            finalPrice = price - (price * 0.25);
        } else if (price > 2500) {
            finalPrice = price - (price * 0.10);
            if (cupPhoto.equals("Y")) {
                finalPrice = finalPrice + numberTicket * 40;
            }
        } else {
            finalPrice = price;
            if (cupPhoto.equals("Y")) {
                finalPrice = finalPrice + numberTicket * 40;
            }
        }

        System.out.printf("%.2f", finalPrice);

    }
}
