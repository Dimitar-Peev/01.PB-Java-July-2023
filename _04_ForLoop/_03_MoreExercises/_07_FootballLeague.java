package _4_ForLoop._3_MoreExercises;

import java.util.Scanner;

public class _07_FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = Integer.parseInt(scanner.nextLine());
        int allPeople = Integer.parseInt(scanner.nextLine());

        int sectorA = 0;
        int sectorB = 0;
        int sectorV = 0;
        int sectorG = 0;

        for (int i = 0; i < allPeople; i++) {
            String sector = scanner.nextLine();

            if (sector.equals("A")) {
                sectorA++;
            } else if (sector.equals("B")) {
                sectorB++;
            } else if (sector.equals("V")) {
                sectorV++;
            } else if (sector.equals("G")) {
                sectorG++;
            }
        }

        double sectorAPercent = (100.0 / allPeople) * sectorA;
        System.out.printf("%.2f%%%n", sectorAPercent);
        double sectorBPercent = (100.0 / allPeople) * sectorB;
        System.out.printf("%.2f%%%n", sectorBPercent);
        double sectorVPercent = (100.0 / allPeople) * sectorV;
        System.out.printf("%.2f%%%n", sectorVPercent);
        double sectorGPercent = (100.0 / allPeople) * sectorG;
        System.out.printf("%.2f%%%n", sectorGPercent);
        double totalPercent = (allPeople * 1.0 / capacity) * 100;
        System.out.printf("%.2f%%%n", totalPercent);

    }
}
