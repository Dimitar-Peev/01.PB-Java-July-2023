package PB_Exams.PB_Online_Exam_15_and_16_June_2019;

import java.util.Scanner;

public class _01_MovieProfit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();
        int daysCount = Integer.parseInt(scanner.nextLine());
        int ticketsCount = Integer.parseInt(scanner.nextLine());
        double priceTicket = Double.parseDouble(scanner.nextLine());
        int cinemaPercent = Integer.parseInt(scanner.nextLine());

        double dayProfit = ticketsCount * priceTicket;
        double totalProfit = dayProfit * daysCount;
        double sumCinema = totalProfit * (cinemaPercent / 100.0);
        double finalProfit = totalProfit - sumCinema;

        System.out.printf("The profit from the movie %s is %.2f lv.", movieName, finalProfit);
    }
}
