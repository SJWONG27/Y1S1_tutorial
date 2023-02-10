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
public class Q1C {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("PLs enter a character.");
        char val = keyboard.next().charAt(0);
        
        if (Character.isUpperCase(val))
            System.out.println("it is a capital letter.");
        else
            System.out.println("it is not a capital letter.");
    }
    
}
