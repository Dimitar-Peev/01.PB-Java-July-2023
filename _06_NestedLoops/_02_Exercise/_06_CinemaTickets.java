package _6_NestedLoops._2_Exercise;

import java.util.Scanner;

public class _06_CinemaTickets {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int standard = 0;
        int student = 0;
        int kid = 0;

        String movieName = scanner.nextLine();
        while (!"Finish".equalsIgnoreCase(movieName)) {
            int freeSeats = Integer.parseInt(scanner.nextLine());
            int seats = freeSeats;

            String ticketType = scanner.nextLine();
            while (!"End".equalsIgnoreCase(ticketType)) {
                --freeSeats;
                switch (ticketType) {
                    case "standard":
                        ++standard;
                        break;
                    case "student":
                        ++student;
                        break;
                    case "kid":
                        ++kid;
                        break;
                }

                if (freeSeats <= 0) {
                    break;
                }

                ticketType = scanner.nextLine();
            }

            System.out.printf("%s - %.2f%% full.%n", movieName, (double) (seats - freeSeats) / seats * 100);
            movieName = scanner.nextLine();
        }

        int totalTickets = standard + student + kid;

        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", (double) student / totalTickets * 100);
        System.out.printf("%.2f%% standard tickets.%n", (double) standard / totalTickets * 100);
        System.out.printf("%.2f%% kids tickets.%n", (double) kid / totalTickets * 100);
    }
}
