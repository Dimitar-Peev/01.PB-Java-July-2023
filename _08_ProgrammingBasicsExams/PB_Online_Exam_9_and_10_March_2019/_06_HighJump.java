package PB_Online_Exam_9_and_10_March_2019;

import java.util.Scanner;

public class _06_HighJump {
    public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        int height = Integer.parseInt(scanner.nextLine());

        int staringHeight = height - 30;
        int jumps = 0;
        boolean isFailed = false;

        while (staringHeight <= height) {
            for (int i = 0; i < 3; i++) {
                int currentJum = Integer.parseInt(scanner.nextLine());
                jumps++;
				
                if (currentJum > staringHeight) {
                    staringHeight += 5;
                    break;
                }
				
                if (i == 2) {
                    System.out.printf("Tihomir failed at %dcm after %d jumps.", staringHeight, jumps);
                    isFailed = true;
                }
            }
			
            if (isFailed) {
                break;
            }
        }
		
        if (!isFailed) {
            System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.", height, jumps);
        }
    }
}
