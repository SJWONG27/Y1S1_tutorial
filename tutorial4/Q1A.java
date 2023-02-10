/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tutorial4;

import java.util.Random;

/**
 *
 * @author SJ
 */
public class Q1A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random g = new Random();
        int x;
        x = g.nextInt(13);
        
        if ((x*x*x)>1727 && (x*x*x)<2000)
            System.out.println(x);
        else
            x++;
    }
    
}
