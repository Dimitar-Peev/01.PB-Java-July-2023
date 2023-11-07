package PB_Online_Exam_6_and_7_April_2019;

import java.util.Scanner;

public class _05_MovieRatings {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countMovies = Integer.parseInt(scanner.nextLine()); //5

        double maxRating = 0;
        String nameMax = "";
        double minRating = 11;
        String nameMin = "";
        double sumRating = 0;
        for (int i = 1; i <= countMovies; i++) {
            String nameMovie = scanner.nextLine();
            double currentRating = Double.parseDouble(scanner.nextLine());

            sumRating = sumRating + currentRating;

            if (currentRating > maxRating) {
                maxRating = currentRating;
                nameMax = nameMovie;
            }

            if (currentRating < minRating) {
                minRating = currentRating;
                nameMin = nameMovie;
            }
        }

        System.out.printf("%s is with highest rating: %.1f%n", nameMax, maxRating);
        System.out.printf("%s is with lowest rating: %.1f%n", nameMin, minRating);
        double avgRating = sumRating / countMovies;
        System.out.printf("Average rating: %.1f%n", avgRating);
    }
}
