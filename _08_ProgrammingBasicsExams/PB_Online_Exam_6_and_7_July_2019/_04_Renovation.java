package PB_Exams.PB_Online_Exam_6_and_7_July_2019;

import java.util.Scanner;

public class _04_Renovation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int h = Integer.parseInt(scanner.nextLine());
        int w = Integer.parseInt(scanner.nextLine());
        int percentUnpainted = Integer.parseInt(scanner.nextLine());

        double area = Math.ceil(h * w * 4.0);
        double areaPainted = area * (1 - percentUnpainted / 100.0);

        String input = scanner.nextLine();
        while (!input.equals("Tired!")) {
            int paint = Integer.parseInt(input);

            areaPainted = areaPainted - paint;

            if (areaPainted <= 0) {
                break;
            }

            input = scanner.nextLine();
        }

        if (areaPainted == 0) {
            System.out.println("All walls are painted! Great job, Pesho!");
        }else if (areaPainted > 0) {
            System.out.printf("%.0f quadratic m left.", areaPainted);
        } else {
            System.out.printf("All walls are painted and you have %.0f l paint left!", Math.abs(areaPainted));
        }

    }
}
