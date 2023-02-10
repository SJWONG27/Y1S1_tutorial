// define static method that use to determine wheteher the parameter is a pentagonal number;
// Pentagonal number is a figurate number that extends concept of triangular and square numbers to pentagon
// Pn = 1/2 n(3n-1)
package tutorial6;

/**
 *
 * @author SJ
 */
public class Q1D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public static boolean pentagonal (int a){
        int i =0, n;
        do{
            n = ((3*i-1)*i)/2;
            i+=1;
        }while(n<a);
        
        if(n==a)
            return true;
        else
            return false;
         
    }
    
}
