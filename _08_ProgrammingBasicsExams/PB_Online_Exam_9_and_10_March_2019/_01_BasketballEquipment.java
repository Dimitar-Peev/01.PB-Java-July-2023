package PB_Online_Exam_9_and_10_March_2019;

import java.util.Scanner;

public class _01_BasketballEquipment {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int priceForYear= Integer.parseInt(scanner.nextLine());

        double sneakers = priceForYear - (priceForYear * 0.4);
        double sportOufit = sneakers - (sneakers * 0.2);
        double ball = sportOufit / 4;
        double accsessories = ball / 5;
        double result = sneakers + sportOufit + ball + accsessories + priceForYear;

        System.out.printf("%.2f", result);
    }
}
