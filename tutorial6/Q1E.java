// define static method that displays number of letters and number of digits of a String parameter
package tutorial6;

/**
 *
 * @author SJ
 */
public class Q1E {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String letters = "ABCDEFGHIJKLMNOPQRSTUV";
        displays(letters);
    }
    
    public static void displays(String A){
        for(int i =0; i<A.length(); i++){
            System.out.println(A.charAt(i) + " at " + i);
            }
        }
    }
 

