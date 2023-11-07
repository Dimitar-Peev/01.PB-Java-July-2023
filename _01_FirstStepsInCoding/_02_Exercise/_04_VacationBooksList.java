package _03_java.first.steps.in.coding.exercise;

import java.util.Scanner;

public class _04_VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfPages = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int numbOfDays = Integer.parseInt(scanner.nextLine());

        int result = numOfPages / pagesPerHour / numbOfDays;

        System.out.println(result);
    }
}
