package _6_NestedLoops._1_Lab;

import java.util.Scanner;

public class _05_Travelling {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
		
        String input = scanner.nextLine();
        while (!input.equals("End")){

            double neededMoney = Double.parseDouble(scanner.nextLine());
            double savedMoney = Double.parseDouble(scanner.nextLine());

            while (savedMoney < neededMoney){
                double sumForSave = Double.parseDouble(scanner.nextLine());
                savedMoney += sumForSave;
            }

            System.out.println("Going to " + input + "!");

            input = scanner.nextLine();
        }
    }
}
