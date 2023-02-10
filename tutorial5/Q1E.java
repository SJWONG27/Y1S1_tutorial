// initialize an array with value;
package tutorial5;

import java.util.Arrays;
/**
 *
 * @author SJ
 */
public class Q1E {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] table = {{6,9},{2,6},{4,6}};
        
        for (int i =0; i<table.length; i++){
            for(int j=0; j<table[i].length; j++)
                System.out.print(table[i][j]+" ");
            System.out.println("");
        }
        
    }
    
}
