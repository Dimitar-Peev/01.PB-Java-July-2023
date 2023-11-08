package PB_Exams.PB_Online_Exam_28_and_29_March_2020;

import java.util.Scanner;

public class _03_EnergyBooster {
    public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String size = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        double price = 0;

        switch (fruit) {
            case "Watermelon":
                switch (size) {
                    case "small":
                        price = 56 * 2;
                        break;
                    case "big":
                        price = 28.70 * 5;
                        break;
                }
                break;
            case "Mango":
                switch (size) {
                    case "small":
                        price = 36.66 * 2;
                        break;
                    case "big":
                        price = 19.60 * 5;
                        break;
                }
                break;
            case "Pineapple":
                switch (size) {
                    case "small":
                        price = 42.10 * 2;
                        break;
                    case "big":
                        price = 24.80 * 5;
                        break;
                }

                break;
            case "Raspberry":
                switch (size) {
                    case "small":
                        price = 20 * 2;
                        break;
                    case "big":
                        price = 15.20 * 5;
                        break;
                }
                break;
        }

        price = price * count;

        if (price >= 400 && price <= 1000) {
            price -= price * 0.15;
        } else if (price > 1000) {
            price -= price * 0.5;
        }

        System.out.printf("%.2f lv.", price);
    }
}
