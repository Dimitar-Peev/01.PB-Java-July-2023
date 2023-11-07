package _5_WhileLoop._3_MoreExercises;

import java.util.Scanner;

public class _01_Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int detergentBottles = Integer.parseInt(scanner.nextLine());

        int countCharging = 0;
        int totalDishes = 0;
        int totalPots = 0;
        int detergentLeftover = detergentBottles * 750;

        String command = scanner.nextLine();
        while (!command.equals("End")) {
            int current = Integer.parseInt(command);

            countCharging++;
            if (countCharging % 3 == 0) {
                totalPots += current;
                detergentLeftover -= current * 15;
            } else {
                totalDishes += current;
                detergentLeftover -= current * 5;
            }


            if (detergentLeftover < 0) {
                System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(detergentLeftover));
                return;
            }

            command = scanner.nextLine();
        }

            System.out.printf("Detergent was enough!\n" +
                    "%d dishes and %d pots were washed.\n" +
                    "Leftover detergent %d ml.\n", totalDishes, totalPots, detergentLeftover);

        scanner.close();
    }
}
