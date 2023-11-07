package _3_ConditionalStatementsAdvanced._3_MoreExercises;

import java.util.Scanner;

public class _08_PointOnRectangleBorder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());

        boolean border1 = (x == x1) && (y >= y1) && (y <= y2);
        boolean border2 = (x == x2) && (y >= y1) && (y <= y2);
        boolean border3 = (y == y1) && (x >= x1) && (x <= x2);
        boolean border4 = (y == y2) && (x >= x1) && (x <= x2);

        if (border1 || border2 || border3 || border4) {
            System.out.println("Border");
        } else {
            System.out.println("Inside / Outside");
        }
    }
}
