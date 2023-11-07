package _03_java.first.steps.in.coding.exercise;

import java.util.Scanner;

public class _01_USDtoBGN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double usd = Double.parseDouble(sc.nextLine());
        //double bgn = usd * 1.79549;
        System.out.println(usd * 1.79549);
    }
}
