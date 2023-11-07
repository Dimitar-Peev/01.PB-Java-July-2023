package PB_Online_Exam_20_and_21_April_2019;

import java.util.Scanner;

public class _02_EasterGuests {
    public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        int guestCount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        int countEasterBread = guestCount / 3;
        if (guestCount % 3 != 0) {
            countEasterBread++;
        }

        int egssFor10 = guestCount * 2;

        double price = countEasterBread * 4 + egssFor10 * 0.45;

        if (price <= budget) {
            System.out.printf("Lyubo bought %d Easter bread and %d eggs.\n", countEasterBread, egssFor10);
            System.out.printf("He has %.2f lv. left.", budget - price);
        } else {
            System.out.println("Lyubo doesn't have enough money.");
            System.out.printf("He needs %.2f lv. more.", price - budget);
        }
    }
}
