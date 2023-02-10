/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tutorial3;

import java.util.Arrays;
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
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Pls enter two words in lowercase");
        String w01 = keyboard.nextLine();
        String w02 = keyboard.nextLine();
        
        char charArray[] = w01.toCharArray();
        Arrays.sort(charArray);
        System.out.println(new String(charArray));
        
        char chararray[] = w02.toCharArray();
        Arrays.sort(chararray);
        System.out.println(new String(chararray));
    }
    
}
