package _4_ForLoop._1_Lab;

import java.util.Scanner;

public class _05_CharacterSequence {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        for (int position = 0; position < text.length(); position++) {
            char letter = text.charAt(position);
            System.out.println(letter);
        }


    }
}
