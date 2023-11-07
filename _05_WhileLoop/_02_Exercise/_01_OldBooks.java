package _5_WhileLoop._2_Exercise;

import java.util.Scanner;

public class _01_OldBooks {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String bookName = scanner.nextLine(); 

        String command = "No More Books";
        int bookCount = 0; 
        boolean isBookFound = false; 


        String input = scanner.nextLine();   

        while (!command.equals(input)) { 
            ++bookCount;                
			
            if (bookName.equals(input)){         
                isBookFound = true;              
                break;                           
            }

            input = scanner.nextLine();          
        }

        if (!isBookFound) {
            System.out.printf("The book you search is not here!%nYou checked %d books.", bookCount);
        } else {
            System.out.printf("You checked %d books and found it.", bookCount);
        }


    }
}
