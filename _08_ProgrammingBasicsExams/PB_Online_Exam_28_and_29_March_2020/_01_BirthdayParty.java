package PB_Exams.PB_Online_Exam_28_and_29_March_2020;

import java.util.Scanner;

public class _01_BirthdayParty {
    public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        double rent = Double.parseDouble(scanner.nextLine());

        double cake = rent * 0.2 ;
        double drinks = cake * 0.55;
        double animator = rent / 3;
        double totalSum = rent + cake + drinks + animator;

        System.out.printf("%f",totalSum);
    }
}
