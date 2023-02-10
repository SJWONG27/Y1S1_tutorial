/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tutorial2;

import java.util.Scanner;

/**
 *
 * @author SJ
 */
public class Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double num;
        System.out.println("Enter diameter: ");
        num = keyboard.nextDouble();
        double total = num*2*Math.PI;
        System.out.print("The circumference of the circle is: " );
        System.out.printf("%.3f",(double)total);
    }
    
}
