package PB_Online_Exam_6_and_7_April_2019;

import java.util.Scanner;

public class _01_OscarsCeremony {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rent = Integer.parseInt(scanner.nextLine());

        double statuettesPrice = rent * 0.7;
        double cateringPrice = statuettesPrice * 0.85;
        double voicingPrice = cateringPrice / 2;

        double totalPrice = statuettesPrice + cateringPrice + voicingPrice + rent;

        System.out.printf("%.2f", totalPrice);
    }
}
