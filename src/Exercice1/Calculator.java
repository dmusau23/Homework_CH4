/**Class: Calculator
 * @author Daniel Musau
 * @version 1.0
 * Course: ITEC 2150 Spring 2024
 * Written: March 31, 2024
 *
 * This class contains the main method and here we add two integers entered
 * by the user and print their sum while handling the different exception that may occur.
 */

package Exercice1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean flag1 = true, flag2 = true;

        // Prompt the user to enter the first integer
        System.out.print("Enter the first integer: ");
        int num1 = 0;

        /**
         * the next block handles the exception that may occur when the user type a value different than an integer
         * we catch the exception and ask the user to try again.
         * the try and catch is nested inside a do-while loop.
         * the loop stops only when the test variable is set to false; meaning that the user entered the correct input.
         */
        do {
            try {
                num1 = input.nextInt();
                flag1 = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter an integer.");
                input.nextLine();
                System.out.println("Try again.");
            }
        }while (flag1);

        // Prompt the user to enter the second integer
        System.out.print("Enter the second integer: ");
        int num2 = 0;

        /**
         * the next block handles the exception that may occur when the user type a value different than an integer
         * we catch the exception and ask the user to try again.
         * the try and catch is nested inside a do-while loop.
         * the loop stops only when the test variable is set to false; meaning that the user entered the correct input.
         */
        do {
            try {
                num2 = input.nextInt();
                flag2 = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter an integer.");
                input.nextLine();
                System.out.println("Try again.");
            }
        }while (flag2);

        // Calculate the sum of the two numbers
        int sum = num1 + num2;

        // Print the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

    }
}
