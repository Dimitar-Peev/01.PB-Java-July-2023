package _4_ForLoop._3_MoreExercises;

import java.util.Scanner;

public class _03_Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double totalTons = 0;

        double tonVan = 0;
        double tonTruck = 0;
        double tonTrain = 0;

        for (int i = 0; i < n; i++) {
            int ton = Integer.parseInt(scanner.nextLine());
            totalTons += ton;

            if (ton <= 3) {
                tonVan += ton;
            } else if (ton <= 11) {
                tonTruck += ton;
            } else {
                tonTrain += ton;
            }

        }

        double averagePrice = ((tonVan * 200) + (tonTruck * 175) + (tonTrain * 120)) / totalTons;
        System.out.printf("%.2f%n", averagePrice);
        double tonVanPercent = (tonVan / totalTons) * 100;
        System.out.printf("%.2f%%%n", tonVanPercent);
        double tonTruckPercent = (tonTruck / totalTons) * 100;
        System.out.printf("%.2f%%%n", tonTruckPercent);
        double tonTrainPercent = (tonTrain / totalTons) * 100;
        System.out.printf("%.2f%%%n", tonTrainPercent);

    }
}
