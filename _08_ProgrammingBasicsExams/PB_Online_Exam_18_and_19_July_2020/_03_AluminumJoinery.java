package PB_Exams.PB_Online_Exam_18_and_19_July_2020;

import java.util.Scanner;

public class _03_AluminumJoinery {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        String size = scanner.nextLine();
        String delivery = scanner.nextLine();

        double price = 0;

        if (number < 10){
            System.out.println("Invalid order");
        } else {
            switch (size) {
                case "90X130":
                    price = 110;
                    if (number > 30 && number <= 60){
                        price *= 0.95;
                    } else if (number > 60) {
                        price *= 0.92;
                    }
                    break;
                case "100X150":
                    price = 140;
                    if (number > 40 && number <= 80){
                        price *= 0.94;
                    } else if (number > 80) {
                        price *= 0.9;
                    }
                    break;
                case "130X180":
                    price = 190;
                    if (number > 20 && number <= 50){
                        price *= 0.93;
                    } else if (number > 50) {
                        price *= 0.88;
                    }
                    break;
                case "200X300":
                    price = 250;
                    if (number > 25 && number <= 50){
                        price *= 0.91;
                    } else if (number > 50) {
                        price *= 0.86;
                    }
                    break;
            }

            double totalSum = price * number;

            if (delivery.equals("With delivery")){
                totalSum += 60;
            } else if (delivery.equals("Without delivery")){
                totalSum = totalSum;
            }

            if (number > 99) {
                totalSum *= 0.96;
            }


            System.out.printf("%.2f BGN", totalSum);
        }


    }
}
