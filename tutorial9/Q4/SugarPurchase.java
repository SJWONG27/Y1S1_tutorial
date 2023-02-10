
package tutorial9.Q4;

public class SugarPurchase extends PurchaseSystem {
    private double sugarweight;
    
    public SugarPurchase(String productcode, double unitprice, int quantity, double sugarweight){
        super(productcode, unitprice, quantity);
        this.sugarweight = sugarweight;
    }
    @Override
    public double calculatePrice(){
        double totalprice = unitprice*quantity*sugarweight;
        return totalprice;
    }
}
