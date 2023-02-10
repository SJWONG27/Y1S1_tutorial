// write a program that consist of method that can display three numbers in decreasing order;
package tutorial6;
import java.util.Random;

public class Q2 {

    public static void getNum(){
        Random g = new Random();
        int [] ranNum = new int [3];
        for(int i =0; i<ranNum.length; i++)
            ranNum[i] = g.nextInt(100)+1;
        
        for(int i =0; i<ranNum.length-1; i++) 
            if(ranNum[i]<ranNum[i+1]){
                int hold = ranNum[i];
                ranNum[i] = ranNum[i+1];
                ranNum[i+1]=hold;
            }        
        
        for(int i=0; i<ranNum.length; i++)
            System.out.print(ranNum[i]+" ");
        
    }
    
    public static void main(String[] args) {
        getNum();
    }
    
}
