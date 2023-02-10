// Write statements that generate 1 random integer within 0-255. 
// Convert the number to binary and store the bit into an 8 bit array. Then, display the binary number.
package tutorial5;
import java.util.Random;
/**
 *
 * @author SJ
 */
public class Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random g = new Random();
        int num = g.nextInt(256);
        System.out.println(Integer.toBinaryString(num));
        
        }
        
    }
    

