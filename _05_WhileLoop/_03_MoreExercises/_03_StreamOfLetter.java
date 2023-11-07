package _5_WhileLoop._3_MoreExercises;

import java.util.Scanner;

public class _03_StreamOfLetter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        boolean isC = false;
        boolean isO = false;
        boolean isN = false;
        String result = "";
        while (!input.equals("End")) {

            char symbol = input.charAt(0);
            if (Character.isAlphabetic(symbol)) {
                if (symbol == 'c') {
                    if (isC) {
                        result += symbol;
                    } else {
                        isC = true;
                    }
                } else if (symbol == 'o') {
                    if (isO) {
                        result += symbol;
                    } else {
                        isO = true;
                    }
                } else if (symbol == 'n') {
                    if (isN) {
                        result += symbol;
                    } else {
                        isN = true;
                    }
                } else {
                    result += symbol;
                }

                if (isC && isO && isN) {
                    result += " ";
                    System.out.print(result);
                    result = "";
                    isC = false;
                    isO = false;
                    isN = false;
                }

            }

            input = scanner.nextLine();
        }
    }
}
