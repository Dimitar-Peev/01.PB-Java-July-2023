package _4_ForLoop._3_MoreExercises;

import java.util.Scanner;

public class _04_Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countStudents = Integer.parseInt(scanner.nextLine());

        double totalSum = 0;
        int studenstWithExcellent = 0;
        int studenstWithVeryGood = 0;
        int studenstWithGood = 0;
        int studenstWithFail = 0;

        for (int i = 0; i < countStudents; i++) {
            double grade = Double.parseDouble(scanner.nextLine());
            totalSum += grade;

            if (grade >= 5) {
                studenstWithExcellent++;
            } else if (grade >= 4) {
                studenstWithVeryGood++;
            } else if (grade >= 3) {
                studenstWithGood++;
            } else if (grade >= 2) {
                studenstWithFail++;
            }
        }

        double averageGrade6 = studenstWithExcellent / (countStudents / 100.0);
        System.out.printf("Top students: %.2f%%%n", averageGrade6);
        double averageGrade5 = studenstWithVeryGood / (countStudents / 100.0);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", averageGrade5);
        double averageGrade4 = studenstWithGood / (countStudents / 100.0);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", averageGrade4);
        double averageGrade3 = studenstWithFail / (countStudents / 100.0);
        System.out.printf("Fail: %.2f%%%n", averageGrade3);
        double averageGrade = totalSum / countStudents;
        System.out.printf("Average: %.2f%n", averageGrade);
    }
}
