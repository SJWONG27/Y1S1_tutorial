
package tutorial9.Q3;

public class SpecialPay extends PaySystem {
    public double totalPay(double payrate, double hour){
        double totalPay = payrate*hour;
        return totalPay = totalPay*1.3;
    }
    public void displayTotalPay(){
        System.out.println("The total pay is: " + calculateTotalPay(payrate, hour));
    }
}
