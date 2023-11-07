package _4_ForLoop._3_MoreExercises;

import java.util.Scanner;

public class _02_Hospital {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int period = Integer.parseInt(scanner.nextLine());

        int doctors = 7;
        int treated = 0;
        int untreated = 0;

        for (int i = 1; i <= period; i++) {
            int patients = Integer.parseInt(scanner.nextLine());

            if (i % 3 == 0) {
                if (untreated > treated) {
                    doctors++;
                }
            }

            if (doctors >= patients) {
                treated = treated + patients;
            } else {
                untreated = untreated + (patients - doctors);
                treated = treated + doctors;
            }
        }

        System.out.printf("Treated patients: %d.%n", treated);
        System.out.printf("Untreated patients: %d.", untreated);

    }
}
