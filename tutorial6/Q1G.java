// define a static void method that returns area and circumference of a circle given the argument is radius.

package tutorial6;
import java.util.Scanner;

/**
 *
 * @author SJ
 */
public class Q1G {
    static Scanner input = new Scanner (System.in);
    static double A,C;
    
    public static void getAreaCircumference(double radius){
        A = Math.PI*(radius*radius);
        C = Math.PI*(2*radius); 
    }
    
    public static void main(String[] args) {
        System.out.print("enter radius: ");
        double radius = input.nextInt();
        getAreaCircumference(radius);
        System.out.printf("Area: %.2f" , A);
        System.out.print("cm\n");
        System.out.printf("Circumference:%.2f" , C);
        System.out.print("cm\n");
    }  
}
