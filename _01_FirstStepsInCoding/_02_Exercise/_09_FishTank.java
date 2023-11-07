package _03_java.first.steps.in.coding.exercise;

import java.util.Scanner;

public class _09_FishTank {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int l = Integer.parseInt(scanner.nextLine());
        int w = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double volume = l * w * h;
        double volumeLitters = volume / 1000;

        double result = volumeLitters * (1 - percent / 100);

        System.out.println(result);
    }
}
