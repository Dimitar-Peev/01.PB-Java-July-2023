package _2_ConditionalStatements._3_MoreExercises;

import java.util.Scanner;

public class _08_FuelTankPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuelType = scanner.nextLine();
        int fuelQuantity = Integer.parseInt(scanner.nextLine());
        String clubCard = scanner.nextLine();

        double fuelPrice = 0;

        switch (fuelType){
            case "Gas":
                if (clubCard.equals("Yes")){
                    fuelPrice = 0.93-0.08;
                } else if (clubCard.equals("No")){
                    fuelPrice = 0.93;
                }
                break;
            case "Gasoline":
                if (clubCard.equals("Yes")){
                    fuelPrice = 2.22-0.18;
                } else if (clubCard.equals("No")){
                    fuelPrice = 2.22;
                }
                break;
            case "Diesel":
                if (clubCard.equals("Yes")){
                    fuelPrice = 2.33-0.12;
                } else if (clubCard.equals("No")){
                    fuelPrice = 2.33;
                }
                break;
        }

        double totalPrice = fuelPrice * fuelQuantity;

        if (fuelQuantity >= 20 && fuelQuantity <= 25){
            totalPrice = totalPrice * 0.92;
        } else if (fuelQuantity > 25) {
            totalPrice = totalPrice * 0.9;
        }


        System.out.printf("%.2f lv.", totalPrice);



    }
}
