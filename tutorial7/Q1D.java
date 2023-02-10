// read from a and c
package tutorial7;
import java.io.EOFException;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;

public class Q1D {

    public static void main(String[] args) {
        int num01=0, sum=0, cnt=0,i=0;
        
        try{
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("C:\\Users\\SJ\\Documents\\NetBeansProjects\\year1tutorial\\integer.dat"));
        BufferedReader inputStream2 = new BufferedReader(new FileReader("integer.txt"));
        try{    
            while(true){
                num01 = inputStream.readInt();
                System.out.print( num01 + " ");
                sum += num01;
                cnt++;
            }        
        }catch(EOFException e){
            System.out.println("");};
            String num02 = inputStream2.readLine();
            String[] num2= num02.split(" ");
            while(i<num2.length){
                sum+= Integer.parseInt(num2[i]);
                System.out.print (num2[i] + " ");
                i++;
            }
            System.out.println();
            System.out.printf("The average = %.2f", (double)sum/(cnt+i));
            System.out.println();
        inputStream.close();
        inputStream2.close();
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        catch(IOException e){
            System.out.println("Problem with file input");
        }
    }
    
}
