// read from text file generated in a.
package tutorial7;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Q1B {

    public static void main(String[] args) {
        int num, max =0;
        try{
            Scanner inputStream = new Scanner (new FileReader("integer.txt"));
            System.out.print("All the integers: ");
            while (inputStream.hasNextInt()){
                num = inputStream.nextInt();
                System.out.print( num + " ");
                if(num>max)
                    max = num; 
            }
            System.out.println("");
            System.out.println("The largest integer: " + max);
            inputStream.close();
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }
    
    
}
}
