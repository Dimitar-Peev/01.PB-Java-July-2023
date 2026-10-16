package _2_ConditionalStatements._3_MoreExercises;

import java.util.Scanner;

public class _07_FuelTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuelType = scanner.nextLine();
        int fuel_liters = Integer.parseInt(scanner.nextLine());

        boolean isValidFuel = fuelType.equals("Diesel") || fuelType.equals("Gasoline") || fuelType.equals("Gas");

        if (!isValidFuel) {
            System.out.println("Invalid fuel!");
        } else {
            if (fuel_liters >= 25) {
                System.out.println("You have enough " + fuelType.toLowerCase() + ".");
            } else {
                System.out.println("Fill your tank with " + fuelType.toLowerCase() + "!");
            }
        }
    }
}
