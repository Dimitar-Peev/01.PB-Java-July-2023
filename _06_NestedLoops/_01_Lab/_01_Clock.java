package _6_NestedLoops._1_Lab;

public class _01_Clock {
    public static void main(String[] args) throws InterruptedException {

        for (int hours = 0; hours <= 23; hours++) {
            for (int minutes = 0; minutes <= 59 ; minutes++) {
                System.out.printf("%d:%d%n", hours, minutes);

            }
        }
    }
}