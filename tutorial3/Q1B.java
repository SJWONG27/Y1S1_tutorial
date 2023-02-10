/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tutorial3;

import java.util.Scanner;

/**
 *
 * @author SJ
 */
public class Q1B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Pls enter an integer = ");
        int num = keyboard.nextInt();
        
        if (num%2 != 0)
            System.out.println("the input integer is an odd number.");
        else
            System.out.println("the input integer is an even number.");
    }
    
}
