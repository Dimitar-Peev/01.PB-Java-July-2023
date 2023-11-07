package PB_Exams.PB_Online_Exam_15_and_16_June_2019;

import java.util.Scanner;

public class _02_MovieDay {
    public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        int photoTime = Integer.parseInt(scanner.nextLine());
        int numberOfScenes = Integer.parseInt(scanner.nextLine());
        int sceneDuration = Integer.parseInt(scanner.nextLine());

        double fieldPreparation = photoTime * 0.15;
        double timeForScenes = numberOfScenes * sceneDuration;
        double totalTime = fieldPreparation + timeForScenes;

        if (totalTime <= photoTime) {
            System.out.printf("You managed to finish the movie on time! You have %d minutes left!", Math.round(photoTime - totalTime));
        } else {
            System.out.printf("Time is up! To complete the movie you need %d minutes.", Math.round(totalTime - photoTime));
        }
    }
}
