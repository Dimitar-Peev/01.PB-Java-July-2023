package PB_Online_Exam_20_and_21_April_2019;

import java.util.Scanner;

public class _05_EasterEggs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int eggs = Integer.parseInt(scanner.nextLine());

        int redEggsCount = 0;
        int orangeEggsCount = 0;
        int blueEggsCount = 0;
        int greenEggsCount = 0;
        int maxEggsCount = 0;
        String maxEggsColor = "";

        for (int i = 0; i < eggs; i++) {
            String color = scanner.nextLine();

            switch (color) {
                case "red":
                    redEggsCount++;
                    if (maxEggsCount < redEggsCount){
                        maxEggsCount = redEggsCount;
                        maxEggsColor = "red";
                    }
                    break;
                case "orange":
                    orangeEggsCount++;
                    if (maxEggsCount < orangeEggsCount){
                        maxEggsCount = orangeEggsCount;
                        maxEggsColor = "orange";
                    }
                    break;
                case "blue":
                    blueEggsCount++;
                    if (maxEggsCount < blueEggsCount){
                        maxEggsCount = blueEggsCount;
                        maxEggsColor = "blue";
                    }
                    break;
                case "green":
                    greenEggsCount++;
                    if (maxEggsCount < greenEggsCount){
                        maxEggsCount = greenEggsCount;
                        maxEggsColor = "green";
                    }
                    break;
            }
        }

        System.out.printf("Red eggs: %d\n" +
                          "Orange eggs: %d\n" +
                          "Blue eggs: %d\n" +
                          "Green eggs: %d\n" +
                          "Max eggs: %d -> %s",
                redEggsCount,
                orangeEggsCount,
                blueEggsCount,
                greenEggsCount,
                maxEggsCount,
                maxEggsColor);

        scanner.close();
    }
}
