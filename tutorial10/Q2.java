
package tutorial10;

public class Q2 {
    public static void main(String[] args) {
        SavingAccount a = new SavingAccount(1000);
        FixedAccount b = new FixedAccount(2000);
        a.display();
        b.display();
    }    
}
interface Interest{
    double computeInterest();
}
class SavingAccount implements Interest{
    private double balance;
    public SavingAccount (double balance){
        this.balance = balance;
    }
    @Override
    public double computeInterest(){
        return balance*0.005/12;
    }
    public void display(){
        System.out.println("Balance: " + balance);
        System.out.println("This month interest: " + computeInterest());
    }
}
class FixedAccount implements Interest{
    private double balance;
    public FixedAccount(double balance){
        this.balance = balance;
    }
    public double computeInterest(){
        return balance*0.03/12;
    }
    public void display(){
        System.out.println("Balance: " + balance);
        System.out.println("This month interest: " + computeInterest());
    }
}