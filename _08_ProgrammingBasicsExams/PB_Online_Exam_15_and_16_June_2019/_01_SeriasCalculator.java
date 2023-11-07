package PB_Exams.PB_Online_Exam_15_and_16_June_2019;

import java.util.Scanner;

public class _01_SeriasCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String serialName = scanner.nextLine();
        int season = Integer.parseInt(scanner.nextLine());
        int episode = Integer.parseInt(scanner.nextLine());
        double timeForEpisode = Double.parseDouble(scanner.nextLine());

        double timeForAds = 0.2 * timeForEpisode;
        double totalTimeForEpisode = timeForEpisode + timeForAds;
        double addTime = season * 10;

        double totalTime = season * episode * totalTimeForEpisode + addTime;

        System.out.printf("Total time needed to watch the %s series is %.0f minutes.", serialName, Math.floor(totalTime));
    }
}
