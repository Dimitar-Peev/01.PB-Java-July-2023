package _2_ConditionalStatements._3_MoreExercises;

import java.util.Scanner;

public class _06_FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int magnolias = Integer.parseInt(scanner.nextLine());
        int hyacinths = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int cacti = Integer.parseInt(scanner.nextLine());
        double giftPrice = Double.parseDouble(scanner.nextLine());

        double profit = ((magnolias * 3.25) + (hyacinths * 4) + (roses * 3.5) + (cacti * 8)) * 0.95;

        if (profit >= giftPrice) {
            System.out.printf("She is left with %.0f leva.", Math.floor(profit - giftPrice));
        } else {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(giftPrice - profit));
        }

    }
}
