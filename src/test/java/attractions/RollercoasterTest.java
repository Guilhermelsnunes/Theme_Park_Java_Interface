package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
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
    public void tallAdult(){
        Visitor tall = new Visitor(35,205,300.00);
        assertEquals(16.80, rollerCoaster.defaultPrice(tall), 0.0);
    }

//    @Test
//    public void childPrice(){
//        Visitor child = new Visitor(5,95,25.00);
//        assertEquals(16.80, );
//    }


}
