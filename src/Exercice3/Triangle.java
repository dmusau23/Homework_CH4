/**Class: IllegalTriangleSideException
 * @author Daniel Musau
 * @version 1.0
 * Course: ITEC 2150 Spring 2024
 * Written: March 31, 2024
 *
 * This class takes in as attributes the lengths of three triangles and check  the sides to determinate if they are valid triangles or not.
 */

package Exercice3;

public class Triangle {

    //class attributes
    private double side1;
    private double side2;
    private double side3;

    //constructor
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    /**
     * This method makes sure that the three sides of the triangle meet the proper criteria for a triangle.
     * It will return true if and only if the sum of side1+ side2 is greater than side3
     * AND the sum side2+side3 is greater than side1 AND the sum of side1+ side3 is greater than side2.
     * @return true
     * @throws IllegalTriangleSideException
     */
    public boolean checkSides() throws IllegalTriangleSideException{
        if(!(side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2)){
             throw new IllegalTriangleSideException("Invalid Triangle!");
        }
        return true;
    }
}
