/**Class: IllegalTriangleSideException
 * @author Daniel Musau
 * @version 1.0
 * Course: ITEC 2150 Spring 2024
 * Written: March 31, 2024
 *
 * This class extends from the Exception class, so that we can create our own customized exception
 */
package Exercice3;

public class IllegalTriangleSideException extends Exception{

    //constructor
    public IllegalTriangleSideException(String txt){
        super(txt);
    }
}
