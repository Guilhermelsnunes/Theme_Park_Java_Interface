package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void adultCanBuy(){
        Visitor adult = new Visitor(30, 185, 85.00);
        assertEquals(true, tobaccoStall.isAllowedTo(adult));
    }

    @Test
    public void childCanNotBuy(){
        Visitor child = new Visitor(8,130,25.00);
        assertEquals(false, tobaccoStall.isAllowedTo(child));
    }



}
