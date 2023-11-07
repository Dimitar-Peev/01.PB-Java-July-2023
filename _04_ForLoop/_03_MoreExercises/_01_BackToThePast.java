package _4_ForLoop._3_MoreExercises;

import java.util.Scanner;

public class _01_BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int year = Integer.parseInt(scanner.nextLine());
        int age = 18;
        int diff = year - 1800;

        for (int i = 0; i <= diff; i++) {
            if (i % 2 == 0) {
                money -= 12000;
            } else {
                money = money - (12000 + (50 * age));
            }
            age++;
        }

        if (money >= 0) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", money);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", Math.abs(money));
        }
    }
}
