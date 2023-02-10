
package tutorial9.Q3;

public class PaySystem {
    protected double payrate;
    protected double hour;
    private double totalPay;
    
    public double calculateTotalPay(double totalPay, double hour){
        totalPay = payrate*hour;
        return totalPay;
    }
    public void displayTotalPay(){
        System.out.println(totalPay);
    }
}
