/*By Juan Lagos
* CSC 201
* Professor Tanes Kanchanawanchai
* Assignment 3 Chapter 3
* Computer Configuration
* Due Date: 09/10/17*/
import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {

        Scanner uInput = new Scanner(System.in);
        System.out.print("Enter a three-digit integer: ");
        while (uInput.hasNextInt()) {
            // Prompt the user to enter a three-digit integer
            int enter = uInput.nextInt();

            // Test for palindrome
            int position1 = enter / 100;
            int remaining = enter % 100;
            int position3 = (remaining % 10);

            // Results
            System.out.println(enter + ((position1 == position3) ? " is a " : " is not a ") + "palindrome. Press Control+D to end.");
        }
    }
}