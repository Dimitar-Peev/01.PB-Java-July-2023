package _7_ExamPrep;

import java.util.Scanner;

public class _01_OscarsCeremony {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rent = Integer.parseInt(scanner.nextLine());

        double statuettes = rent - (rent * 0.3);
        double catering = statuettes - (statuettes * 0.15);
        double sounds = catering / 2;

        double finalPrice = rent + statuettes + catering + sounds;

        System.out.printf("%.2f", finalPrice);

    }
}
