package PB_Exams.PB_Online_Exam_28_and_29_March_2020;

import java.util.Scanner;

public class _02_MountainRun {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeInSecOneM = Double.parseDouble(scanner.nextLine());

        double georgiTime = distance * timeInSecOneM;
        double delay = Math.floor(distance / 50) * 30;
        double totalTime = georgiTime + delay;

        if (totalTime < record) {
            System.out.printf("Yes! The new record is %.2f seconds.", totalTime);
        } else {
            double diff = totalTime - record;
            System.out.printf("No! He was %.2f seconds slower.", diff);
        }
    }
}
