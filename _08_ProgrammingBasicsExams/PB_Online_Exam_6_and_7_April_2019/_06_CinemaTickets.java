package PB_Online_Exam_6_and_7_April_2019;

import java.util.Scanner;

public class _06_CinemaTickets {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();

        int studentTickets = 0;
        int standardTickets = 0;
        int kidTickets = 0;
        int totalTickets = 0;

        while (!movieName.equals("Finish")) {
            int freeSeats = Integer.parseInt(scanner.nextLine());
            double people = 0;
            for (int i = 0; i < freeSeats; i++) {
                String ticketType = scanner.nextLine();
                switch (ticketType) {
                    case "student":
                        studentTickets++;
                        break;
                    case "standard":
                        standardTickets++;
                        break;
                    case "kid":
                        kidTickets++;
                        break;
                }

                if (people >= freeSeats || ticketType.equals("End")){
                    break;
                }

                people++;
                totalTickets++;
            }

            System.out.printf("%s - %.2f%% full.%n", movieName, people / freeSeats * 100);

            movieName = scanner.nextLine();
        }

        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", 100.0 / totalTickets * studentTickets);
        System.out.printf("%.2f%% standard tickets.%n", 100.0 / totalTickets * standardTickets);
        System.out.printf("%.2f%% kids tickets.%n", 100.0 / totalTickets * kidTickets);


    }
}
