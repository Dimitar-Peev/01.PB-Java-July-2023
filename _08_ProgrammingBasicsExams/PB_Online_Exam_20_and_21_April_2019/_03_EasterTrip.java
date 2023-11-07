package PB_Online_Exam_20_and_21_April_2019;

import java.util.Scanner;

public class _03_EasterTrip {
    public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();
        String dates = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double pricePerNight = 0;

        switch (destination){
            case "France":
                if (dates.equals("21-23")){
                    pricePerNight = 30;
                } else if (dates.equals("24-27")) {
                    pricePerNight = 35;
                } else if (dates.equals("28-31")) {
                    pricePerNight = 40;
                }
                break;
            case "Italy":
                if (dates.equals("21-23")){
                    pricePerNight = 28;
                } else if (dates.equals("24-27")) {
                    pricePerNight = 32;
                } else if (dates.equals("28-31")) {
                    pricePerNight = 39;
                }
                break;
            case "Germany":
                if (dates.equals("21-23")){
                    pricePerNight = 32;
                } else if (dates.equals("24-27")) {
                    pricePerNight = 37;
                } else if (dates.equals("28-31")) {
                    pricePerNight = 43;
                }
                break;
        }

        double neededMoney = nights * pricePerNight;

        System.out.printf("Easter trip to %s : %.2f leva.", destination, neededMoney);
    }
}
