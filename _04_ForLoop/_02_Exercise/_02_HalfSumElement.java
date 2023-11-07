package _4_ForLoop._2_Exercise;

import java.util.Scanner;

public class _02_HalfSumElement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0 ;  
        int max = 0 ;  

        for (int i = 0; i < n; i++) {
            int inputNumber = Integer.parseInt(scanner.nextLine()); 
            
            sum = sum + inputNumber;

            if (inputNumber > max) {
                max = inputNumber;
            }
        }
        
        sum = sum - max;

        if (sum == max) {  
            System.out.printf("Yes%nSum = %d", sum); 
        } else { 
            System.out.printf("No%nDiff = %d", Math.abs(sum-max));
        }




    }
}
