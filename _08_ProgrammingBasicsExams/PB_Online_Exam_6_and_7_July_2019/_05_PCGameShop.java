package PB_Exams.PB_Online_Exam_6_and_7_July_2019;

import java.util.Scanner;

public class _05_PCGameShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double hearthstoneCount = 0;
        double forniteCount = 0;
        double overwatchCount = 0;
        double otherCount = 0;

        for (int i = 1; i <= n; i++) {
            String gameName = scanner.nextLine();

            switch (gameName) {
                case "Hearthstone":
                    hearthstoneCount++;
                    break;
                case "Fornite":
                    forniteCount++;
                    break;
                case "Overwatch":
                    overwatchCount++;
                    break;
                default:
                    otherCount++;
                    break;
            }
        }

        System.out.printf("Hearthstone - %.2f%%\n", hearthstoneCount  / n * 100);
        System.out.printf("Fornite - %.2f%%\n", forniteCount / n * 100);
        System.out.printf("Overwatch - %.2f%%\n", overwatchCount  / n * 100);
        System.out.printf("Others - %.2f%%\n", otherCount  / n * 100);
    }
}
