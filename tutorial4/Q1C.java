/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tutorial4;

/**
 *
 * @author SJ
 */
public class Q1C {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int row =1; row<=4; row++){
                System.out.println("");
                for (int column = 1; column<=5; column++){
                    int x = (int)(Math.random()*(100+1)+0);
                    System.out.print(x+" ");
             
            }
        }
    }
    
}
