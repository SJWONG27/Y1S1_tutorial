/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tutorial4;

/**
 *
 * @author SJ
 */
public class Q1E {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double sum=0;
        int x=1, y=25;
        for(int i=1; i<=25;i++){
            sum+= (double)((double)x/(double)y);
            x++;
            y--;
        } System.out.printf("%.2f",sum);
    }
    
}
