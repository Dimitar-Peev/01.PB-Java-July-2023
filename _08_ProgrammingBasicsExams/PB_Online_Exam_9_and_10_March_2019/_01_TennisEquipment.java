package PB_Online_Exam_9_and_10_March_2019;

import java.util.Scanner;

public class _01_TennisEquipment {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double tennisRacketPrice = Double.parseDouble(scanner.nextLine());
        int tennisRackets = Integer.parseInt(scanner.nextLine());
        int sneakers = Integer.parseInt(scanner.nextLine());

        double racketsTotalPrice = tennisRackets * tennisRacketPrice;
        double sneakersPrice = tennisRacketPrice / 6;
        double sneakersTotalPrice = sneakersPrice * sneakers;
        double otherEquipment = (racketsTotalPrice + sneakersTotalPrice) * 0.2;

        double totalPrice = racketsTotalPrice + sneakersTotalPrice + otherEquipment;

        System.out.printf("Price to be paid by Djokovic %.0f\n", Math.floor(totalPrice/8));
        System.out.printf("Price to be paid by sponsors %.0f", Math.ceil(totalPrice*(7/8.0)));

    }
}
