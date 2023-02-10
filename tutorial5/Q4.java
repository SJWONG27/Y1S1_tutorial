// write statements that display number of occurence of the word "the" in a string array name sentence
package tutorial5;
import java.util.Scanner;

/**
 *
 * @author SJ
 */
public class Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence01 = k.nextLine();
        String sentence02 = sentence01.toLowerCase();
        
        System.out.println("Enter a word to be check");
        String word = k.nextLine();
        String [] a = sentence02.split(" ");
        
        int count = 0;
        for (int i = 0; i < a.length; i++){
            if (word.equals(a[i]))
             count++;
             }
        System.out.println("number of occurence of the word: "+ count);
    }
    
}
