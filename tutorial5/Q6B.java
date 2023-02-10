/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tutorial5;

/**
 *
 * @author SJ
 */
public class Q6B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int input =100;
        boolean[]bits = new boolean[8];
        
        for(int i =7; i>=0; i--){
            bits[7-i] = (input & (1<<i)) !=0;
        }
        System.out.print(input+"=");
        for(int i =0; i < bits.length; i++){
            if (bits[i])
                System.out.print("1");
            else
                System.out.print("0");
        }
    }
    
}
