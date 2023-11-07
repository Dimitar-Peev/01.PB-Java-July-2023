package PB_Exams.PB_Online_Exam_6_and_7_July_2019;

import java.util.Scanner;

public class _02_Shopping {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCount = Integer.parseInt(scanner.nextLine());
        int cpuCount = Integer.parseInt(scanner.nextLine());
        int ramCount = Integer.parseInt(scanner.nextLine());

        double totalVideo = videoCount * 250.0;
        double totalCPU = (totalVideo * 0.35) * cpuCount;
        double totalRam = (totalVideo * 0.1) * ramCount;
        double totalSum = totalVideo + totalCPU + totalRam;

        if (videoCount > cpuCount) {
            totalSum = totalSum * 0.85;
        }

        double diff = Math.abs(budget - totalSum);

        if (budget >= totalSum) {
            System.out.printf("You have %.2f leva left!", diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", diff);
        }


    }
}
