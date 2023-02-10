/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tutorial4;

import java.util.Scanner;

/**
 *
 * @author SJ
 */
public class Q1D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Pls enter a number");
        int x;
        x=k.nextInt();
        
        int sum =0;
        for(int i=1; i<=x; i++){
            sum += i;
            
        }System.out.println(sum);
    }
    
}
