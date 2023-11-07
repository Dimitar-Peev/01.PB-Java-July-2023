package _7_ExamPrep;

import java.util.Scanner;

public class _05_Renovation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double height = Double.parseDouble(scanner.nextLine());
        double weight = Double.parseDouble(scanner.nextLine());
        double wallPercentageNotPainted = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();

        double area = height * weight * 4;
        double areaToBePainted = area - area * ( wallPercentageNotPainted / 100 );

        double areaLeftToBePainted = 0;
        while (!"Tired!".equals(input)){

            double quantity = Double.parseDouble(input);

            areaToBePainted = areaToBePainted - quantity;
            areaLeftToBePainted = Math.abs(areaToBePainted);

            if (areaToBePainted < 0) {
                System.out.printf("All walls are painted and you have %.0f l paint left!", Math.ceil(areaLeftToBePainted));
                return;
            } else if (areaToBePainted == 0 ) {
                System.out.println("All walls are painted! Great job, Pesho!");
                return;
            }

            input = scanner.nextLine();
        }

        System.out.printf("%.0f quadratic m left.", Math.ceil(areaLeftToBePainted));


    }
}
