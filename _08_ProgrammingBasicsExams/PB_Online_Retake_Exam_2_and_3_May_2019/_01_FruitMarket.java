package PB_Online_Retake_Exam_2_and_3_May_2019;

import java.util.Scanner;

public class _01_FruitMarket {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double strawberriesPrice = Double.parseDouble(scanner.nextLine());
        double banansKg = Double.parseDouble(scanner.nextLine());
        double orangeKg = Double.parseDouble(scanner.nextLine());
        double raspberriesKg = Double.parseDouble(scanner.nextLine());
        double strawberriesKg = Double.parseDouble(scanner.nextLine());

        double raspberriesPrice = strawberriesPrice / 2;
        double banansPrice = raspberriesPrice * 0.2;
        double orangePrice = raspberriesPrice * 0.6;

        double totalSum = (strawberriesPrice * strawberriesKg)
                + (banansPrice * banansKg)
                + (orangePrice * orangeKg)
                + (raspberriesPrice * raspberriesKg);


        System.out.printf("%.2f", totalSum);
    }
}
