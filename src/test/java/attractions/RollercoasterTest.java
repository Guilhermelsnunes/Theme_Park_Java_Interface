package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor1 = new Visitor(16,140,150.00);
        visitor2 = new Visitor(18,215,50.00);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }





    @Test
    public void adultCanRide(){
        Visitor adult = new Visitor(45, 185, 250.00);
        assertEquals(true, rollerCoaster.isAllowedTo(adult));
    }

    @Test
    public void childCanNotRide(){
        Visitor child = new Visitor( 8, 120, 35.00);
        assertEquals(false, rollerCoaster.isAllowedTo(child));
    }


    @Test
    public void paysStandardPrice() {
        assertEquals(8.40, rollerCoaster.priceFor(visitor1), 0.0);
    }

    @Test
    public void paysDoublePrice() {
        assertEquals(16.80, rollerCoaster.priceFor(visitor2), 0.0);
    }



}
