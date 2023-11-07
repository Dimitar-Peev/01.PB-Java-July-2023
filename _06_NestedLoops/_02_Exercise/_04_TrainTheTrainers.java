package _6_NestedLoops._2_Exercise;

import java.util.Scanner;

public class _04_TrainTheTrainers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numOfJudges = Integer.parseInt(scanner.nextLine());
        double grades = 0;
        int presentation = 0;
        String input = scanner.nextLine();

        while (!"Finish".equalsIgnoreCase(input)) {
            ++presentation;
            double gradeSum = 0;
            for (int i = 0; i < numOfJudges; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                gradeSum += grade;
            }

            grades += gradeSum;
            System.out.printf("%s - %.2f.%n", input, gradeSum / numOfJudges);

            input = scanner.nextLine();
        }

        System.out.printf("Student's final assessment is %.2f.", grades / (presentation * numOfJudges));


    }
}
