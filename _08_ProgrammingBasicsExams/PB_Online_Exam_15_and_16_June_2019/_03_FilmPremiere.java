package PB_Exams.PB_Online_Exam_15_and_16_June_2019;

import java.util.Scanner;

public class _03_FilmPremiere {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();
        String packet = scanner.nextLine();
        int tickets = Integer.parseInt(scanner.nextLine());

        double price = 0;

        switch (movieName) {
            case "John Wick":
                if (packet.equals("Drink")) {
                    price = 12;
                } else if (packet.equals("Popcorn")) {
                    price = 15;
                } else if (packet.equals("Menu")) {
                    price = 19;
                }
                break;
            case "Star Wars":
                if (packet.equals("Drink")) {
                    price = 18;
                } else if (packet.equals("Popcorn")) {
                    price = 25;
                } else if (packet.equals("Menu")) {
                    price = 30;
                }
                break;
            case "Jumanji":
                if (packet.equals("Drink")) {
                    price = 9;
                } else if (packet.equals("Popcorn")) {
                    price = 11;
                } else if (packet.equals("Menu")) {
                    price = 14;
                }
                break;
        }

        double totalPrice = tickets * price;

        if (movieName.equals("Star Wars") && tickets >= 4){
            totalPrice *= 0.7;
        }

        if (movieName.equals("Jumanji") && tickets == 2){
            totalPrice *= 0.85;
        }

            System.out.printf("Your bill is %.2f leva.", totalPrice);
    }
}
