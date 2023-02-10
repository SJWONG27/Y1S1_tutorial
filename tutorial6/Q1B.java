// define a static method that determine whether given integer is a square number;
package tutorial6;
import java.util.Scanner;
/**
 *
 * @author SJ
 */
public class Q1B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("enter an integer to check: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(square(num)== true)
            System.out.println("It is a square number");
        else
            System.out.println("It is not a square number");
    }
    
    public static boolean square (int a){
        double b = Math.sqrt(a);
        if(b*b == a)
            return true;
        else
            return false;
        
    }
    
}
