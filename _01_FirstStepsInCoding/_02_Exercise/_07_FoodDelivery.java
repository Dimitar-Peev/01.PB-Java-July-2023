package _03_java.first.steps.in.coding.exercise;

import java.util.Scanner;

public class _07_FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countChicken = Integer.parseInt(scanner.nextLine());
        int countFish = Integer.parseInt(scanner.nextLine());
        int countVegan = Integer.parseInt(scanner.nextLine());

        double priceChicken = countChicken * 10.35;
        double priceFish = countFish * 12.40;
        double priceVegan = countVegan * 8.15;

        double menuPrice = priceChicken + priceFish + priceVegan;
        double dessertPrice = menuPrice * 20 / 100;

        double result = menuPrice + dessertPrice + 2.50;

        System.out.println(result);
    }
}
