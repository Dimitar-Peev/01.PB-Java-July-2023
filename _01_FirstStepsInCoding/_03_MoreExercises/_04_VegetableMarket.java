package _1_FirstStepsInCoding._3_MoreExercises;

import java.util.Scanner;

public class _04_VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceForKgVegetables = Double.parseDouble(scanner.nextLine());
        double priceForKgFruits = Double.parseDouble(scanner.nextLine());
        int sumForKgVegetables = Integer.parseInt(scanner.nextLine());
        int sumForKgFruits = Integer.parseInt(scanner.nextLine());

        double kgVegetables = priceForKgVegetables * sumForKgVegetables;
        double kgFruits = priceForKgFruits * sumForKgFruits;
        double sum = kgVegetables + kgFruits;
        double euro = sum * 0.5154639175;

        System.out.printf("%.2f %n", euro);
    }
}
