package _1_FirstStepsInCoding._3_MoreExercises;

import java.util.Scanner;

public class _05_TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double w = Double.parseDouble(scanner.nextLine()) * 100;
        double h = Double.parseDouble(scanner.nextLine()) * 100;

        double freeSpaceW = Math.floor(w / 120);
        double freeSpaceH = Math.floor((h - 100) / 70);
        double countWorkSpace = (freeSpaceH * freeSpaceW) - 3;

        System.out.printf("%.0f", countWorkSpace);
    }
}
