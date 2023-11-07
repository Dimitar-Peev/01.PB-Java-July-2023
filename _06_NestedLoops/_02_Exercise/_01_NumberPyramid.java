package _6_NestedLoops._2_Exercise;

import java.util.Scanner;

public class _01_NumberPyramid {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int num = 1;

        for (int rows = 0; rows <= n; rows++) {

            for (int colums = 0; colums <= rows ; colums++) {
                if (num > n){
                    break;
                }

                System.out.print(num + " ");
                ++num;
            }
			
            if (num > n){
                break;
            }
			
            System.out.println();
        }
    }
}
