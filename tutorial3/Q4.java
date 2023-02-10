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
public class Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("pls enter three integers");
        int x = keyboard.nextInt();
        int y = keyboard.nextInt();
        int z = keyboard.nextInt();
        
        if (x>y && x>z)
            System.out.println(x);
        else if (y>x && y>z)
            System.out.println(y);
        else if (z>x && z>y)
            System.out.println(z);
    }
    
}
