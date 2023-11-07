package PB_Online_Exam_20_and_21_April_2019;

import java.util.Scanner;

public class _03_PaintingEggs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String size = scanner.nextLine(); 
        String color = scanner.nextLine(); 
        int count = Integer.parseInt(scanner.nextLine()); 

        int pricePerOne = 0; 

        if (size.equals("Large")) {
         
            if (color.equals("Red")) {
                pricePerOne = 16;
            } else if (color.equals("Green")) {
                pricePerOne = 12;
            } else if (color.equals("Yellow")) {
                pricePerOne = 9;
            }
			
        } else if (size.equals("Medium")) {
			
            if (color.equals("Red")) {
                pricePerOne = 13;
            } else if (color.equals("Green")) {
                pricePerOne = 9;
            } else if (color.equals("Yellow")) {
                pricePerOne = 7;
            }
			
        } else if (size.equals("Small")) {
			
            if (color.equals("Red")) {
                pricePerOne = 9;
            } else if (color.equals("Green")) {
                pricePerOne = 8;
            } else if (color.equals("Yellow")) {
                pricePerOne = 5;
            }
        }

        double totalPrice = count * pricePerOne; 
        double expenses = 0.35 * totalPrice; 

        double finalSum = totalPrice - expenses;
        System.out.printf("%.2f leva.", finalSum);

    }
}
