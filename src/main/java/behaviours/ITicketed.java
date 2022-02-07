package behaviours;

import people.Visitor;

public interface ITicketed {

    double defaultPrice();
    boolean priceFor(Visitor visitor);


}
