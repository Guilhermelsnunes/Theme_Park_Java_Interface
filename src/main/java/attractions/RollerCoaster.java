package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity, IReviewed, ITicketed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getHeight() >= 145 && visitor.getAge() >= 12;
    }


    public double defaultPrice () {
        return defaultPrice() * 2;
    }

    @Override
    public boolean priceFor(Visitor visitor) {
        return false;
    }

//    @Override
//    public boolean priceFor (Visitor visitor) {
//        return visitor.getHeight() >= 200;
//    }



}
