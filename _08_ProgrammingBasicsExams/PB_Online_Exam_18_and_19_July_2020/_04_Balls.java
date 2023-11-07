package PB_Exams.PB_Online_Exam_18_and_19_July_2020;

import java.util.Scanner;

public class _04_Balls {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
		
        int countBalls = Integer.parseInt(scanner.nextLine()); 

        int totalPoints = 0;        
        int countRedBalls = 0;     
        int countOrangeBalls = 0;  
        int countYellowBalls = 0;   
        int countWhiteBalls = 0;  
        int countOtherBalls = 0;    
        int countBlackBalls = 0;   

        for (int ball = 1; ball <= countBalls; ball++) {
            String color = scanner.nextLine();
			
            switch (color) {
                case "red":
                    totalPoints += 5;
                    countRedBalls++;
                    break;
                case "orange":
                    totalPoints += 10;
                    countOrangeBalls++;
                    break;
                case "yellow":
                    totalPoints += 15;
                    countYellowBalls++;
                    break;
                case "white":
                    totalPoints += 20;
                    countWhiteBalls++;
                    break;
                case "black":
                    totalPoints /= 2;
                    countBlackBalls++;
                    break;
                default:
                    countOtherBalls++;
                    break;
            }
        }

        System.out.println("Total points: " + totalPoints);
        System.out.println("Red balls: " + countRedBalls);
        System.out.println("Orange balls: " + countOrangeBalls);
        System.out.println("Yellow balls: " + countYellowBalls);
        System.out.println("White balls: " + countWhiteBalls);
        System.out.println("Other colors picked: " + countOtherBalls);
        System.out.println("Divides from black balls: " + countBlackBalls);
    }
}
