package _5_WhileLoop._2_Exercise;

import java.util.Scanner;

public class _07_Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int w = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());

        int freeSpace = w * l * h;
        int boxes = 0;

        String input = scanner.nextLine();
        while (!"Done".equalsIgnoreCase(input)) {
            int numOfBoxes = Integer.parseInt(input);
            boxes += numOfBoxes;

            if (boxes >= freeSpace) {
                break;
            }

            input = scanner.nextLine();
        }

        int result = Math.abs(boxes - freeSpace);

        if (boxes >= freeSpace) {
            System.out.printf("No more free space! You need %d Cubic meters more.", result);
        } else {
            System.out.printf("%d Cubic meters left.", result);
        }
    }

}
