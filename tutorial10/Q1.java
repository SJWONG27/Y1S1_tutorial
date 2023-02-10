
package tutorial10;

public class Q1 {

    public static void main(String[] args) {
        double itemCost = 50;
        int count = 5;
        BulkDiscount a = new BulkDiscount(3,0.05);
        OtherDiscount b = new OtherDiscount();
        combineDiscount c = new combineDiscount(a,b);
        System.out.println("Item cost: " + itemCost);
        System.out.println("Quantity: " + count);
        System.out.println("Bulk discount: " + a.computeDiscount(count, itemCost));
        System.out.println("Other discount: " + b.computeDiscount(count, itemCost));
        System.out.println("Combined discount " + c.computeDiscount(count, itemCost));
        
    }
}

abstract class DiscountPolicy{
   public abstract double computeDiscount(int count, double itemCost);
}
class BulkDiscount extends DiscountPolicy{
    private int minimum;
    private double discountRate;
    public BulkDiscount(int minimum, double discountRate){
        this.minimum = minimum;
        this.discountRate = discountRate;
    }
    @Override
    public double computeDiscount(int count, double itemCost){
      if(count>minimum)
          return itemCost*discountRate;
      return 0;
    }
}
class OtherDiscount extends DiscountPolicy{
    @Override
    public double computeDiscount(int count, double itemCost){
        if(count>8)
            return itemCost*0.3;
        else if(count>=6)
            return itemCost*0.2;
        else if(count>=3)
            return itemCost*0.1;

        return 0;
    }
}
class combineDiscount extends DiscountPolicy{
    private DiscountPolicy policy1;
    private DiscountPolicy policy2;

    public combineDiscount(DiscountPolicy policy1, DiscountPolicy policy2) {
        this.policy1 = policy1;
        this.policy2 = policy2;
    }

    
    @Override
    public double computeDiscount(int count, double itemCost){
        if(policy1.computeDiscount(count, itemCost) > policy2.computeDiscount(count, itemCost))
            return policy1.computeDiscount(count, itemCost);
        else
            return policy2.computeDiscount(count, itemCost);
    }
}
