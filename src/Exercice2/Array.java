/**Class: Array
 * @author Daniel Musau
 * @version 1.0
 * Course: ITEC 2150 Spring 2024
 * Written: March 31, 2024
 *
 * This class contains the main method and here we first, create and fill an array of size 50 with random double numbers,
 * second, prompt the user to enter a number that will be the index to look for into the previous array,
 * and then we print the value found in the array at that index while handling the different exceptions that may occur.
 */

package Exercice2;

import java.util.Random;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        // Create an array of 50 double values
        double[] array = new double[50];
        Random random = new Random();

        //fill the array through looping with a random double
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextDouble();
        }

        //create a scanner instance to retrieve user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter an index
        System.out.print("Enter an index (between 0 and 49): ");
        int index;

        //create a boolean to test the next block
        boolean stop = true;

        do {
            try {
                index = input.nextInt();
                // Check if the entered index is within the range of the array
                if (index < 0 || index >= array.length) {
                    throw new ArrayIndexOutOfBoundsException("Index is out of range");
                }

                stop = false;

                // Print the corresponding value in the array
                System.out.println("Value at index " + index + ": " + array[index]);
            } catch (ArrayIndexOutOfBoundsException e) {
                //if we encounter an ArrayIndexOutOfBoundsException, we print what happened and ask the user to try entering another value again
                System.out.println("Please enter an index between 0 and 49.");
                input.nextLine();
                System.out.println("Try again.");
            } catch (Exception e) {
                //if an exception occur, we print what happened and ask the user to try entering another value again
                System.out.println("Please enter a valid integer index.");
                input.nextLine();
                System.out.println("Try again.");
            }
        }while(stop); // this loop will end only when the flag variable is set to false, meaning that the user entered a correct value
    }
}
