package _5_WhileLoop._2_Exercise;

import java.util.Scanner;

public class _06_Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int w = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());

        int pieces = w * l ;

        String input = scanner.nextLine();
        while (!"STOP".equalsIgnoreCase(input)) {
            int numOfPieces = Integer.parseInt(input);
            pieces -= numOfPieces;

            if (pieces <= 0) {
                break;
            }

            input = scanner.nextLine();
        }

        if (pieces > 0) {
            System.out.printf("%d pieces are left.", pieces);
        } else {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(pieces));
        }
    }
}
