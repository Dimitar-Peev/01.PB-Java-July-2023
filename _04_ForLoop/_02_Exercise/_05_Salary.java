package _4_ForLoop._2_Exercise;

import java.util.Scanner;

public class _05_Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int browserTabsCount = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < browserTabsCount; i++) {

            String browserTabName = scanner.nextLine();

            switch (browserTabName) {
                case "Facebook":
                    salary -= 150;
                    break;
                case "Instagram":
                    salary -= 100;
                    break;
                case "Reddit":
                    salary -= 50;
                    break;
            }

            if (salary <= 0) {
                System.out.println("You have lost your salary.");
                break;
            }
        }

        if (salary > 0) {
            System.out.println(salary);
        }
    }
}
