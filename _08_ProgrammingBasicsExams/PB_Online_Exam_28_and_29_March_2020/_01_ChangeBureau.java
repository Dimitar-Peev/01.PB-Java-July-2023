package PB_Exams.PB_Online_Exam_28_and_29_March_2020;

import java.util.Scanner;

public class _01_ChangeBureau {
    public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        int bitcoin = Integer.parseInt(scanner.nextLine());
        double chinese = Double.parseDouble(scanner.nextLine());
        double comission = Double.parseDouble(scanner.nextLine());

        double bitcoinPriceLeva = 1168;
        double dolarPriceLeva = 1.76;
        double chinesePriceLeva = 0.15 * dolarPriceLeva;
        double euroPriceLeva = 1.95;

        double result = ((bitcoin*bitcoinPriceLeva) + (chinese*chinesePriceLeva)) / euroPriceLeva;
        double resultComision = (result * (comission/100));
        double totalResult = result - resultComision;

        System.out.printf("%.02f", totalResult);
    }
}
