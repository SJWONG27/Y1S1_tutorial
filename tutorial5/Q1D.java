// declare an array for a table with 6 rows 2 columns that used to store integer value
package tutorial5;
import java.util.Random;


/**
 *
 * @author SJ
 */
public class Q1D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random g = new Random();
        int [][] table = new int[6][2];
        
        for (int i =0; i<table.length; i++){
            for(int j=0; j<table[i].length; j++){
                System.out.print(table[i][j]+" "); 
            }
        System.out.println("");
        }
            
        }
            
    }
    

