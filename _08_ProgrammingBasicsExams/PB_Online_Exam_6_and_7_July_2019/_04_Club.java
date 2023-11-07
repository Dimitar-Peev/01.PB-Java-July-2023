package PB_Exams.PB_Online_Exam_6_and_7_July_2019;

import java.util.Scanner;

public class _04_Club {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double profit = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();

        boolean flag = false;
        double totalSum = 0;
        while (!command.equals("Party!")) {
            String cocktailName = command;
            int countCocktail = Integer.parseInt(scanner.nextLine());

            int lenghtName = cocktailName.length();
            double sumCocktails = lenghtName * countCocktail;

            if (sumCocktails % 2 != 0) {
                sumCocktails = sumCocktails * 0.75;
            }

            totalSum = totalSum + sumCocktails;
            if (totalSum >= profit) {
                flag = true;
                break; 
            }

            command = scanner.nextLine();
        }

        double diff = Math.abs(totalSum - profit);

        if (!flag) {
            System.out.printf("We need %.2f leva more.%n", diff);
        } else {
            System.out.println("Target acquired.");
        }

        System.out.printf("Club income - %.2f leva.%n", totalSum);
    }
}
