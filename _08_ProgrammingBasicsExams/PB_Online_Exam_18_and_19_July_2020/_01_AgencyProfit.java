package PB_Exams.PB_Online_Exam_18_and_19_July_2020;

import java.util.Scanner;

public class _01_AgencyProfit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String airline = scanner.nextLine();
        int ticketsForAdults = Integer.parseInt(scanner.nextLine());
        int ticketsForChilds = Integer.parseInt(scanner.nextLine());
        double ticketAdultsNetPrice = Double.parseDouble(scanner.nextLine());
        double serviceFee = Double.parseDouble(scanner.nextLine());

        double ticketChildNetPrice = ticketAdultsNetPrice * 0.3;
        double adultWithService = ticketAdultsNetPrice + serviceFee;
        double childWithService = ticketChildNetPrice + serviceFee;
        double totalPrice = (ticketsForAdults * adultWithService) + (ticketsForChilds * childWithService);
        double endSum = totalPrice * 0.2;

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", airline, endSum);
    }
}
