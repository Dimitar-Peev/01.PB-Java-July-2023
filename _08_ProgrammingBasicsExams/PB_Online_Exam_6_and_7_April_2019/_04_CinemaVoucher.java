package PB_Online_Exam_6_and_7_April_2019;

import java.util.Scanner;

public class _04_CinemaVoucher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vaucherMoney = Integer.parseInt(scanner.nextLine());
        int counterMovies = 0;
        int counterOther = 0;

        while (true) {
            String buyThings = scanner.nextLine();
            if (buyThings.equals("End")) {
                break;
            }

            int price = buyThings.toCharArray()[0];

            if (buyThings.length() > 8) {
                price += +buyThings.toCharArray()[1];

                if (vaucherMoney - price >= 0) {
                    vaucherMoney -= price;
                    counterMovies++;
                } else {
                    break;
                }

            } else {
                if (vaucherMoney - price >= 0) {
                    vaucherMoney -= price;
                    counterOther++;
                } else {
                    break;
                }
            }
        }

        System.out.println(counterMovies);
        System.out.println(counterOther);

    }
}
