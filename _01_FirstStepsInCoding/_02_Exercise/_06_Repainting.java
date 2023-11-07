package _03_java.first.steps.in.coding.exercise;

import java.util.Scanner;

public class _06_Repainting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nylon = Integer.parseInt(sc.nextLine()) + 2;
        int paint = Integer.parseInt(sc.nextLine());
        int razr = Integer.parseInt(sc.nextLine());
        int hours = Integer.parseInt(sc.nextLine());

        double nylonPrice = nylon * 1.5;
        double paintPrice = paint * 14.5;
        paintPrice = paintPrice + (paintPrice * 10 / 100);
        double razrPrice = razr * 5;

        double sum = nylonPrice + paintPrice + razrPrice + 0.4;
        double workers = hours * (sum * 30 / 100);

        double result = sum + workers;

        System.out.println(result);
    }
}
