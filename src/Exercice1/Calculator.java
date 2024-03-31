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
