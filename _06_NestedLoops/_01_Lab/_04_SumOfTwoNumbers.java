package _6_NestedLoops._1_Lab;

import java.util.Scanner;

public class _04_SumOfTwoNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
		
        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        boolean isFoundValidCombination = false;
        int count = 0;
        for (int firstNumber = start; firstNumber <= end; firstNumber++) {
			
            for (int secondNumber = start; secondNumber <= end ; secondNumber++) {
                count++;
                int sum = firstNumber + secondNumber;
				
                if (sum == magicNumber){

                    System.out.printf("Combination N:%d (%d + %d = %d)",
                            count, firstNumber, secondNumber, magicNumber );

                    isFoundValidCombination = true;
                    break;
                }
            }

            if (isFoundValidCombination){
                break;
            }

        }

        if (!isFoundValidCombination){
            System.out.printf("%d combinations - neither equals %d",
                    count, magicNumber);
        }

    }
}
