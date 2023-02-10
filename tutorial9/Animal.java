
package tutorial9;

import tutorial9.Organism;
import tutorial9.Organism;

public class Animal extends Organism {
    private double amountEat;
    
    public Animal(double initialSize, double growthRate, double amountEat){
        super(initialSize,growthRate);
        this.amountEat = amountEat;
    }

    @Override
    public String toString(){
        return Double.toString(amountEat);
}
}
