package PB_Online_Exam_20_and_21_April_2019;

import java.util.Scanner;

public class _06_EasterCompetition {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countEasterBread = Integer.parseInt(scanner.nextLine()); 
		
        String bestBaker = "";   
        int pointsBestBaker = 0; 

        for (int easterBread = 1; easterBread <= countEasterBread; easterBread++) {
            String baker = scanner.nextLine();
            int totalPoints = 0; 

            String input = scanner.nextLine(); 
            while (!"stop".equalsIgnoreCase(input)) {
                int grade = Integer.parseInt(input);
                totalPoints += grade;
                input = scanner.nextLine();
            }

            System.out.printf("%s has %d points.\n", baker, totalPoints);

            if (totalPoints > pointsBestBaker) {
                bestBaker = baker;
                pointsBestBaker = totalPoints;
                System.out.printf("%s is the new number 1!\n", bestBaker);
            }
        }

        System.out.printf("%s won competition with %d points!\n", bestBaker, pointsBestBaker);


    }
}
