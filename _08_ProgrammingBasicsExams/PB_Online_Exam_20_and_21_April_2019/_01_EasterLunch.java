package PB_Online_Exam_20_and_21_April_2019;

import java.util.Scanner;

public class _01_EasterLunch {
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);

        int cakeCount = Integer.parseInt(scanner.nextLine());
        int eggsCount = Integer.parseInt(scanner.nextLine());
        int cookiesCount = Integer.parseInt(scanner.nextLine());

        double cakePrice = cakeCount * 3.20;
        double eggsPrice = eggsCount * 4.35;
        double cookiesPrice = cookiesCount * 5.40;
        double paintEggsPrice = eggsCount * 12 * 0.15;

        double totalSum = cakePrice + eggsPrice + cookiesPrice + paintEggsPrice;

        System.out.printf("%.2f", totalSum);






    }
}
