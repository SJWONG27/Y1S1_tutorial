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
public class Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Pls enter the year");
        int x = keyboard.nextInt();
        
        if((x%4)==0 && (x%100)!=0 )
            System.out.println("it is a leap year");
        else
            System.out.println("It is not a leap year");
    }
    
}
