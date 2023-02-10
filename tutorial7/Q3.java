// write a program that convert sentence into binary number and store it in a text file (data.txt)
// read from the text file and display the sentence
package tutorial7;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.charset.StandardCharsets;

public class Q3 {

    public static void main(String[] args) {
        try{
            ObjectOutputStream output = new ObjectOutputStream (new FileOutputStream("data.txt"));
            String sentence = "My name is Wong Soon Jit";
            String result = convertToBinary(sentence.getBytes(StandardCharsets.UTF_8));
            output.writeUTF(result);
            output.close();
            
            ObjectInputStream input = new ObjectInputStream (new FileInputStream("data.txt"));
            System.out.println(input.readUTF());
        }catch(IOException e){
            System.out.println("Problem with file output");
        }
    }
    
    public static String convertToBinary(byte[] input){
        StringBuilder result = new StringBuilder();
        for(byte b : input){
            int val = b;
            for(int i =0; i<8; i++){
                result.append((val & 128) == 0? 0:1);
                val <<= 1;
            }
        }return result.toString();
    }
    
}
