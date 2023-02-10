/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tutorial7;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;
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
        try{
            int m =1001;
            
            PrintWriter outputStream = new PrintWriter(new FileOutputStream("integer.txt"));
            Random g = new Random();
            for(int i =0; i<10; i++)
                outputStream.print(g.nextInt(m)+" ");
            outputStream.close();
        }catch(IOException e){
            System.out.println("Problem with file output");
        }
    }
    
}
