package _2_ConditionalStatements._3_MoreExercises;

import java.util.Scanner;

public class _08_FuelTankPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuelType = scanner.nextLine();
        int fuelQuantity = Integer.parseInt(scanner.nextLine());
        String clubCard = scanner.nextLine();

        final double GASOLINE_PRICE = 2.22;
        final double DIESEL_PRICE = 2.33;
        final double GAS_PRICE = 0.93;

        final double GASOLINE_DISCOUNT = 0.18;
        final double DIESEL_DISCOUNT = 0.12;
        final double GAS_DISCOUNT = 0.08;

        double fuelPrice = 0;

        switch (fuelType) {
            case "Gasoline":
                fuelPrice = GASOLINE_PRICE;
                break;
            case "Diesel":
                fuelPrice = DIESEL_PRICE;
                break;
            case "Gas":
                fuelPrice = GAS_PRICE;
                break;
        }

        if (clubCard.equals("Yes")) {
            switch (fuelType) {
                case "Gasoline" -> fuelPrice -= GASOLINE_DISCOUNT;
                case "Diesel" -> fuelPrice -= DIESEL_DISCOUNT;
                case "Gas" -> fuelPrice -= GAS_DISCOUNT;
            }
        }

        double totalPrice = fuelPrice * fuelQuantity;

        if (fuelQuantity >= 20 && fuelQuantity <= 25) {
            totalPrice *= 0.92;
        } else if (fuelQuantity > 25) {
            totalPrice *= 0.9;
        }

        System.out.printf("%.2f lv.", totalPrice);
    }
}
