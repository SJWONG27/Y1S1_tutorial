// define static method that use to compute combination function C(n,k).
// C(n,k) gives the number of different k-element subsets that can be found in a given set of n element
// C(n,k)=   n!/ k!(n-k)!
package tutorial6;

/**
 *
 * @author SJ
 */
public class Q1C {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public static long combination(int n, int k){
        long factorialn =1;
        long factorialk =1;
        long factorialnk =1;
        for(int i =1; i<=n; ++i){
            factorialn *= i;}
        
        for(int i=1; i<=k; ++i){
            factorialk *= i;}
        
        int num = n-k;
        for(int i =1; i<=num; i++){
            factorialnk *=i;}
        
        long result = factorialk*factorialnk;
        return((factorialn/result));
        
    }
    
}
