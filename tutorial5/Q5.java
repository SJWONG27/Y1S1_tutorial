// Write statements that display string array name sentence in reverse order.
// Each string element must be displayed in reverse order as well
package tutorial5;

/**
 *
 * @author SJ
 */
public class Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String sentence = "HAHAHAHA is otw";
        String [] a = sentence.split("");
        
        for(int i=a.length-1 ; i>0; i--){
            System.out.print(a[i]);
        }
        System.out.println("");
    }
    
}
