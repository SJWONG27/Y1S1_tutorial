
package tutorial9.Q4;

public class PurchaseSystem {
    protected String productcode;
    protected double unitprice;
    protected double totalprice;
    protected int quantity;
    
    public PurchaseSystem(String productcode, double unitprice, int quantity){
        this.productcode = productcode;
        this.unitprice = unitprice;
        this.quantity = quantity;
    }
    
    public double calculatePrice(){
        totalprice = quantity * unitprice;
        System.out.println(totalprice);
        return totalprice;
    }

}
