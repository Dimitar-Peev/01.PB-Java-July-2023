package PB_Exams.PB_Online_Exam_15_and_16_June_2019;

import java.util.Scanner;

public class _04_Cinema {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int capacity = Integer.parseInt(scanner.nextLine());

        double income = 0;
        int ticketPrice = 5;
        double totalPrice = 0;

        String input = scanner.nextLine();
        while (!input.equals("Movie time!")) {
            int people = Integer.parseInt(input);

            capacity -= people;

            if (capacity < 0) {
                break;
            }

            if (people % 3 == 0) {
                income = (people * ticketPrice) - 5;
            } else {
                income = people * ticketPrice;
            }

            totalPrice += income;

            input = scanner.nextLine();
        }

        if (capacity < 0) {
            System.out.println("The cinema is full.");
        } else {
            System.out.printf("There are %d seats left in the cinema.%n", capacity);
        }

        System.out.printf("Cinema income - %.0f lv.", totalPrice);
    }
}
