package PB_Online_Exam_9_and_10_March_2019;

import java.util.Scanner;

public class _02_Skeleton {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int minutes = Integer.parseInt(scanner.nextLine()); 
        int seconds = Integer.parseInt(scanner.nextLine()); 
        double length = Double.parseDouble(scanner.nextLine());
        int secondsPer100Meters = Integer.parseInt(scanner.nextLine());

        int timeRecordInSeconds = minutes * 60 + seconds; 

        double countSpeed = length / 120; 
        double timeSpeed = countSpeed * 2.5; 

        double totalTimeInSeconds = (length / 100) * secondsPer100Meters - timeSpeed;

        if (totalTimeInSeconds <= timeRecordInSeconds) {
            System.out.println("Marin Bangiev won an Olympic quota!");
            System.out.printf("His time is %.3f.", totalTimeInSeconds);
        } else {
            double needSeconds = totalTimeInSeconds - timeRecordInSeconds;
            System.out.printf("No, Marin failed! He was %.3f second slower.", needSeconds);
        }

    }
}
