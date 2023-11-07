package _2_ConditionalStatements._3_MoreExercises;

import java.util.Scanner;

public class _07_FuelTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuelType = scanner.nextLine();
        int fuleQuantity = Integer.parseInt(scanner.nextLine());

        switch (fuelType) {
            case "Diesel":
                if (fuleQuantity >= 25){
                    System.out.println("You have enough diesel.");
                } else {
                    System.out.println("Fill your tank with diesel!");
                }
                break;
            case "Gasoline":
                if (fuleQuantity >= 25){
                    System.out.println("You have enough gasoline.");
                } else {
                    System.out.println("Fill your tank with gasoline!");
                }
                break;
            case "Gas":
                if (fuleQuantity >= 25){
                    System.out.println("You have enough gas.");
                } else {
                    System.out.println("Fill your tank with gas!");
                }
                break;
            default:
                System.out.println("Invalid fuel!");
                break;

        }
    }
}
