// define a static void method that generates 10 random numbers within 0 to 100 to method"s parameter
// the random number can be accessed by main method
package tutorial6;
import java.util.Random;
/**
 *
 * @author SJ
 */
public class Q1F {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 0;
        randomNumber(x);
        for(int i =0; i<10; i++)
            System.out.print(x +" ");
    }
    public static void randomNumber (int a){
        Random g = new Random();
        a = g.nextInt(101);
    }
    
}
