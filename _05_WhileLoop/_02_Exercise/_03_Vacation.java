package _5_WhileLoop._2_Exercise;

import java.util.Scanner;

public class _03_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double excursionPrice = Double.parseDouble(scanner.nextLine());
        double availableAmount = Double.parseDouble(scanner.nextLine());

        int spendCount = 0;
        boolean spendALot = false;
        int days = 0;

        while (availableAmount < excursionPrice) {
            ++days;
            String command = scanner.nextLine();
            double amount = Double.parseDouble(scanner.nextLine());

            switch (command) {
                case "spend":
                    availableAmount -= amount;
                    ++spendCount;

                    if (availableAmount < 0){
                        availableAmount = 0;
                    }

                    if (spendCount == 5){
                        spendALot = true;
                    }
                    break;

                case "save":
                    availableAmount += amount;
                    spendCount = 0;
                    break;
            }

            if (spendALot) {
                break; 
            }

        }

        if (spendALot){
            System.out.printf("You can't save the money.\n%d", days);
        } else {
            System.out.printf("You saved the money for %d days.", days);
        }
    }
}
