package attractions;

import behaviours.IReviewed;
import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements IReviewed, ITicketed {


    public Dodgems(String name, int rating) {
        super(name, rating);
    }


    @Override
    public double defaultPrice() {
        return defaultPrice() /2 ;
    }

    @Override
    public boolean priceFor(Visitor visitor) {
        return false;
    }
}
