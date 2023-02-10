//define static method that generate random number within 0 to 10;
// mehtod will return first random number that generate twice
package tutorial6;
import java.util.Random;
/**
 *
 * @author SJ
 */
public class Q1H {

    public static int getRandom(){
        Random g = new Random();
        int A = 0;
        for (int i =0; i<2; i++)
            A = g.nextInt(11);
        return A;
    }
    
    public static void main(String[] args) {
        int x = getRandom();
        int y = getRandom();
        System.out.println(x);
        System.out.println(y);
        
    }
    
}
