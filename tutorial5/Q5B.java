/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tutorial5;

/**
 *
 * @author SJ
 */
public class Q5B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [] sentence ={"the meow"};

       for(int i = sentence.length-1; i>=0; i--){
            for(int j = sentence.length-1; j>=0; j--){
                System.out.print(sentence[i].charAt(j));
            }
                System.out.println("");
        }
    }
    
}
