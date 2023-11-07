package PB_Online_Exam_9_and_10_March_2019;

import java.util.Scanner;

public class _05_FitnessCenter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());

        int backCount = 0;
        int chestCount = 0;
        int legsCount = 0;
        int absCount = 0;
        int proteinShakeCount = 0;
        int proteinBarCount = 0;

        for (int i = 1; i <= people; i++) {
            String type = scanner.nextLine();

            switch (type) {
                case "Back":
                    backCount++;
                    break;
                case "Chest":
                    chestCount++;
                    break;
                case "Legs":
                    legsCount++;
                    break;
                case "Abs":
                    absCount++;
                    break;
                case "Protein shake":
                    proteinShakeCount++;
                    break;
                case "Protein bar":
                    proteinBarCount++;
                    break;
            }
        }

        System.out.println(backCount + " - back");
        System.out.println(chestCount + " - chest");
        System.out.println(legsCount + " - legs");
        System.out.println(absCount + " - abs");
        System.out.println(proteinShakeCount + " - protein shake");
        System.out.println(proteinBarCount + " - protein bar");

        int allWorkOut = backCount + chestCount + legsCount + absCount;
        int allProtein = proteinBarCount + proteinShakeCount;

        System.out.printf("%.2f%% - work out%n", (allWorkOut * 1.0) / people * 100);
        System.out.printf("%.2f%% - protein%n", (allProtein * 1.0) / people * 100);
    }
}
