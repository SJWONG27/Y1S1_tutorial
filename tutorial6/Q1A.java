// define static method that returns max num from 3 integer parameter
package tutorial6;
import java.util.Random;

/**
 *
 * @author SJ
 */
public class Q1A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random g = new Random();
        int a = g.nextInt();
        int b = g.nextInt();
        int c = g.nextInt();
        System.out.println(maximum(a,b,c));
        
    }
    public static int maximum(int a, int b, int c){
        if(a>b && a>c){ 
            return a;
        } 
        else if (b>a && b>c){
            return b;
        }
        else {
            return c; 
        }
        
    }
}
