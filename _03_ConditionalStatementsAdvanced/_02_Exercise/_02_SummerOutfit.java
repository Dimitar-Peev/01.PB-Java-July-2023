package _3_ConditionalStatementsAdvanced._2_Exercise;

import java.util.Scanner;

public class _02_SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int celsius = Integer.parseInt(scanner.nextLine());
        String timeOfTheDay = scanner.nextLine();

        String outfit = "";
        String shoes = "";

        boolean cold = celsius >= 10 && celsius <= 18;
        boolean warm = celsius > 18 && celsius <= 24;
        boolean hot = celsius >= 25;

        switch (timeOfTheDay) {
            case "Morning":
                if (cold) {
                    outfit = "Sweatshirt";
                    shoes = "Sneakers";
                } else if (warm) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (hot) {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                }
                break;
            case "Afternoon":
                if (cold) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (warm) {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                } else if (hot) {
                    outfit = "Swim Suit";
                    shoes = "Barefoot";
                }
                break;
            case "Evening":
                if (cold || warm || hot) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    break;
                }
        }

        System.out.printf("It's %d degrees, get your %s and %s.", celsius, outfit, shoes);

    }
}
