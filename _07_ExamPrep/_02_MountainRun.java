package _7_ExamPrep;

import java.util.Scanner;

public class _02_MountainRun {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double recordInSec = Double.parseDouble(scanner.nextLine());
        double distanceInMeters = Double.parseDouble(scanner.nextLine());
        double climbingOneMeter = Double.parseDouble(scanner.nextLine());

        double runnerTime = distanceInMeters * climbingOneMeter + (Math.floor(distanceInMeters / 50) * 30);

        if (runnerTime >= recordInSec) {
            double neededTime = runnerTime - recordInSec;
            System.out.printf("No! He was %.2f seconds slower.", neededTime);
        } else {
            System.out.printf("Yes! The new record is %.2f seconds.", runnerTime);
        }
    }
}
