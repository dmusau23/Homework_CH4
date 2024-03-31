/**Class: TriangleTester
 * @author Daniel Musau
 * @version 1.0
 * Course: ITEC 2150 Spring 2024
 * Written: March 31, 2024
 *
 * This class contains the main method where we try and test different triangles
 */
package Exercice3;

public class TriangleTester {
    public static void main(String[] args) throws IllegalTriangleSideException {
        //create a first triangle, check the sides and then print the results
        Triangle triangle1= new Triangle(2,4,5);
        System.out.println("Triangle 1.\nResults: "+ triangle1.checkSides());

        //create a second triangle, check the sides and then print the results
        Triangle triangle2= new Triangle(1,3,6);
        System.out.println("Triangle 2.\nResults: "+ triangle2.checkSides());

        //create a third triangle, check the sides and then print the results
        Triangle triangle3= new Triangle(1,2,5);
        System.out.println("Triangle 3.\nResults: "+ triangle3.checkSides());
    }
}
