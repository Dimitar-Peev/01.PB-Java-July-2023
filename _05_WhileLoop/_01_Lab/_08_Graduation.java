package _5_WhileLoop._1_Lab;

import java.util.Scanner;

public class _08_Graduation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int counter = 1;  
        double sum = 0;  
        int excluded = 0; 
        boolean isGraduated = true;

        while (counter <= 12) {
            double grade= Double.parseDouble(scanner.nextLine());

            if (grade < 4.00) {
                excluded++;
                if (excluded >= 2) {
                    isGraduated = false;
                    System.out.printf("%s has been excluded at %d grade", name, counter);
                    break;
                }
                continue;
            }

            sum += grade;  

            counter++;
        }
		
        if (isGraduated) {
            System.out.printf("%s graduated. Average grade: %.2f", name, sum / 12);
        }
    }
}
