/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tutorial5;

/**
 *
 * @author SJ
 */
public class Q1F {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int [][] table = new int[3][2];
        table [0][0]=6;
        table [0][1]=9;
        table [1][0]=2;
        table [1][1]=4;
        table [2][0]=3;
        table [2][1]=7;
        
        for(int i =0; i<table.length; i++){
            for(int j=0; j<table[i].length; j++ )
                System.out.print(table[i][j]+" ");
            
            System.out.println("");
        }
    }
    
}
