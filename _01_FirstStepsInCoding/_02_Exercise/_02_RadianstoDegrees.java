package _03_java.first.steps.in.coding.exercise;

import java.util.Scanner;

public class _02_RadianstoDegrees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        double rad = Double.parseDouble(input);
        double deg = rad * 180 / Math.PI;

        System.out.println(deg);
    }
}
