import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;
    private Plane plane;
    private Passenger passenger1;
    private Passenger passenger2;

    @Before
    public void before(){
        plane = new Plane(PlaneType.AIRBUSA220);
        flight = new Flight(plane,"GLA2020","GLA","AMS","16:45");
    }

    @Test
    public void hasPlane() {
        assertEquals(PlaneType.AIRBUSA220,flight.getPlane());
    }

    @Test
    public void hasFlightNumber() {
        assertEquals("GLA2020",flight.getFlightNumber());
    }

    @Test
    public void hasDestination(){
        assertEquals("GLA",flight.getDestination());
    }

    @Test
    public void hasOrigin(){
        assertEquals("AMS",flight.getOrigin());
    }

    @Test
    public void hasDepartureTime(){
        assertEquals("16:45",flight.getDepartureTime());
    }

    @Test
    public void canGetEmptySeats(){
        assertEquals(108,flight.getEmptySeats());
    }

    @Test
    public void canBookPassenger(){
        flight.bookPassenger(passenger1);
        assertEquals(107,flight.getEmptySeats());
    }
}
