package _5_WhileLoop._2_Exercise;

import java.util.Scanner;

public class _02_ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxPoorGrades = Integer.parseInt(scanner.nextLine());

        String command = "Enough";
        int poorGradesCount = 0;

        int gradesSum = 0;
        int taskCount = 0;
        String lastTaskName = "";
        boolean isMaxPoorGrades = false;

        String input = scanner.nextLine();
        while (!input.equals(command)) {
            lastTaskName = input;
            int grade = Integer.parseInt(scanner.nextLine());
            taskCount++;
            gradesSum += grade;

            if (grade <= 4) {
                poorGradesCount++;

                if (poorGradesCount == maxPoorGrades){
                    isMaxPoorGrades = true;
                    break;
                }
            }

            input = scanner.nextLine();
        }

        if (isMaxPoorGrades){
            System.out.printf("You need a break, %d poor grades.", poorGradesCount);
        } else {
            System.out.printf("Average score: %.2f%n", (double) gradesSum / taskCount);
            System.out.printf("Number of problems: %d%n", taskCount);
            System.out.printf("Last problem: %s%n", lastTaskName);
        }

    }
}
