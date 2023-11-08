package PB_Exams.PB_Online_Exam_28_and_29_March_2020;

import java.util.Scanner;

public class _05_SuitcasesLoad {
    public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        double trunkCapacity = Double.parseDouble(scanner.nextLine());

        double copyTrunkCapacity = trunkCapacity;
        String input = scanner.nextLine();

        boolean isFull = false;
        int count = 0;
        while (!input.equals("End")) {
            double volumeSuitcase = Double.parseDouble(input);

            count++; 

            if (count % 3 == 0) { 
                volumeSuitcase = volumeSuitcase * 1.10;
            }

            copyTrunkCapacity = copyTrunkCapacity - volumeSuitcase;

            if (copyTrunkCapacity < 0) {
                isFull = true; 
                count--;       
                break;
            }

            input = scanner.nextLine();
        }

        if (isFull) {
            System.out.println("No more space!");
        } else {
            System.out.println("Congratulations! All suitcases are loaded!");
        }

        System.out.printf("Statistic: %d suitcases loaded.%n", count);
    }
}
