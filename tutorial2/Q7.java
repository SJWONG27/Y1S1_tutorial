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
public class Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double num;
        System.out.println("Enter value in inch: ");
        num = keyboard.nextDouble();
        double total = num*2.54;
        System.out.print(num + "inches = ");
        System.out.printf("%.2f", (double)total);
        System.out.print("meters");
    }
    
}
