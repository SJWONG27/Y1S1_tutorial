/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tutorial7;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.util.Random;

public class Q1C {

    public static void main(String[] args) {
        try{
            ObjectOutputStream outputStream = new ObjectOutputStream (new FileOutputStream("integer.dat"));
            Random g = new Random();
            int num [] = new int [10];
            for(int i =0; i<num.length; i++)
                num[i] = g.nextInt(1001);
            for(int i =0; i<num.length; i++)
                outputStream.writeInt(num[i]);
                outputStream.writeObject(" ");
            outputStream.close();
        }catch(IOException e){
            System.out.println("Problem with file output");
        }
    }
    
}
